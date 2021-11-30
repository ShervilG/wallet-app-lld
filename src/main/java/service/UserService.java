package service;

import entity.User;
import repo.UserRepository;

public class UserService {

    private final UserRepository userRepository = new UserRepository();

    public void createUser(String name, String address, Double amt) {
        User user = new User();
        user.setBalance(amt);
        user.setName(name);
        user.setAddress(address);

        userRepository.addUser(user);
    }


}
