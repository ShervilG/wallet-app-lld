package service;

import entity.Transaction;
import repo.TransactionRepository;
import java.util.List;

public class TransactionService {

    private final TransactionRepository transactionRepository = new TransactionRepository();

    public void getStatement(String name) {
        List<Transaction> transactions = transactionRepository.getTransactionsForUser(name);

        transactions.forEach(transaction -> {
            String statementLine;
            if (transaction.getTo().equals(name)) {
                statementLine = "Start Time: " + transaction.getInitiatedAt() + " End Time: " +
                        transaction.getCompletedAt() + " " + name + " got " + transaction.getAmount() + " from " +
                        transaction.getFrom();
            } else {
                statementLine = "Start Time: " + transaction.getInitiatedAt() + " End Time: " +
                        transaction.getCompletedAt() + " " + name + " gave " + transaction.getAmount() + " to " +
                        transaction.getFrom();
            }
            System.out.println(statementLine);
        });
    }
}
