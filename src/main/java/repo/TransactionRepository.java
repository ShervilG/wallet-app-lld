package repo;

import entity.Transaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionRepository {

    private final List<Transaction> transactions;

    public TransactionRepository() {
        this.transactions = new ArrayList<>();
    }

    public void saveTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public List<Transaction> getTransactionsForUser(String userName) {
        return this.transactions.stream().filter(transaction -> transaction.getFrom().equals(userName) ||
                transaction.getTo().equals(userName)).collect(Collectors.toList());
    }
}
