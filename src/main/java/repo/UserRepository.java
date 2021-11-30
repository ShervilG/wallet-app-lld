package repo;

import entity.User;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private final Map<String, User> userMap;

    public UserRepository() {
        this.userMap = new HashMap<>();
    }

    public void addUser(User user) {
        this.userMap.put(user.getName(), user);
    }

    public Double getBalance(String name) {
        return this.userMap.get(name).getBalance();
    }

    public void addBalance(String name, Double amt) {
        this.userMap.get(name).setBalance(this.userMap.get(name).getBalance() + amt);
    }

    public void deductBalance(String name, Double amt) {
        this.userMap.get(name).setBalance(this.userMap.get(name).getBalance() - amt);
    }
}
