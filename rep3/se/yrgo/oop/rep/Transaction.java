package se.yrgo.oop.rep;

import java.time.*;

/**
 * An immutable record of a transaction on an account.
 *
 * <p>A transaction has a date, a positive amount, a type, and an optional
 * comment. The transaction type indicates the nature of the transaction,
 * such as a deposit or withdrawal; the type and comment may be {@code null}.
 */
public class Transaction {
    private final Instant date;
    private final double amount;
    private final TransactionType type;
    private final String comment;

    /**
     * Creates a transaction.
     *
     * @param date the transaction date; must not be before 2026-01-01T00:00:00Z
     * @param amount the transaction amount; must be greater than zero
     * @param type the transaction type, or {@code null} if unspecified
     * @param comment an optional note about the transaction; may be {@code null}
     * @throws IllegalArgumentException if {@code amount} is not greater than zero
     *         or {@code date} is before 2026-01-01T00:00:00Z
     * @throws NullPointerException if {@code date} is {@code null}
     */
    public Transaction(Instant date, double amount, TransactionType type, String comment) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be strictly positive");
        }

        if (date.isBefore(Instant.parse("2026-01-01T00:00:00Z"))) {
            throw new IllegalArgumentException("bad date");
        }
        
        this.date = date;
        this.amount = amount;
        this.type = type;
        this.comment = comment;
    }

    /**
     * Returns the transaction date.
     *
     * @return the transaction date
     */
    public Instant getDate() {
        return date;
    }

    /**
     * Returns the transaction amount.
     *
     * @return the positive transaction amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Returns the transaction type.
     *
     * @return the transaction type, or {@code null} if none was provided
     */
    public TransactionType getType() {
        return type;
    }

    /**
     * Returns the optional comment.
     *
     * @return the comment, or {@code null} if none was provided
     */
    public String getComment() {
        return comment;
    }

    /**
     * Returns a string representation of this transaction.
     *
     * @return a string containing this transaction's date, amount, type, and comment
     */
    @Override
    public String toString() {
        return "Transaction [date=" + date + ", amount=" + amount + ", type=" + type + ", comment=" + comment + "]";
    }
}
