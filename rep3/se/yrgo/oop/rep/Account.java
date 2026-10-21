package se.yrgo.oop.rep;

import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.util.*;

/**
 * A list of transactions.
 * 
 * You can only add transactions to an account, never remove any.
 * 
 */
public class Account {
    private String name;
    private List<Transaction> transactions;

    public Account(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("must be a good name");
        }

        this.name = name.strip();
        this.transactions = new ArrayList<>();
    }

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }

    public String getName() {
        return name;
    }

    public double available() {
        double total = 0.0;

        for (Transaction trans : transactions) {
            double amount = switch (trans.getType()) {
                case WITHDRAWAL, SWISH_WITHDRAWAL, PAYMENT, AUTOGIRO -> -trans.getAmount();
                case DEPOSIT, SWISH_DEPOSIT -> trans.getAmount();
                default -> throw new IllegalStateException("whoops, switch malfunction");
            };

            total += amount;
        }

        return total;
    }

    public void save(Path path) throws IOException {
        try (BufferedWriter w = Files.newBufferedWriter(path)) {
            w.write(name);
            w.write("\n");

            for (Transaction trans : transactions) {
                Instant date = trans.getDate();
                double amount = trans.getAmount();
                TransactionType type = trans.getType();
                String comment = trans.getComment();

                w.write(date.toString());
                w.write(",");
                w.write(Double.toString(amount));
                w.write(",");
                w.write(type.toString());
                w.write(",");
                w.write(comment);
                w.write("\n");
            }
        }
    }

    public static Account read(Path path) throws IOException {
        try (BufferedReader r = Files.newBufferedReader(path)) {
            String name = r.readLine();

            Account account = new Account(name);

            String line;
            while ((line = r.readLine()) != null) {
                String[] parts = line.split(",", 4);
                if (parts.length != 4) {
                    throw new IOException("file format problem");
                }

                Instant date = Instant.parse(parts[0]);
                double amount = Double.parseDouble(parts[1]);
                TransactionType type = TransactionType.valueOf(parts[2]);
                String comment = parts[3];

                Transaction trans = new Transaction(date, amount, type, comment);
                account.add(trans);
            }

            return account;
        }
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", transactions=" + transactions + "]";
    }
}
