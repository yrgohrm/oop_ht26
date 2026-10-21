package se.yrgo.oop.rep;

import java.io.*;
import java.nio.file.*;
import java.time.*;

public class App {
    void main() {
        try {
            run();
        } catch (Exception ex) {
            System.err.println("Something went wrong. Try again.");
            ex.printStackTrace();
        }
    }

    private static void run() throws IOException {
        Path accountPath = Path.of("myaccount.txt");

        Account account = Account.read(accountPath);
        
        Transaction trans1 = new Transaction(Instant.now(), 1000, TransactionType.DEPOSIT, "sparpengar");
        account.add(trans1);

        Transaction trans2 = new Transaction(Instant.now(), 50, TransactionType.SWISH_WITHDRAWAL, "snus");
        account.add(trans2);

        System.out.println(account.available());
        // List<Transaction> transactions = account.getTransactions();


        account.save(accountPath);

        
    }
}
