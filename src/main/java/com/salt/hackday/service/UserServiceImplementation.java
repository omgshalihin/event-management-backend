package com.salt.hackday.service;

import com.salt.hackday.model.User;
import com.salt.hackday.model.UserDTO;
import com.salt.hackday.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserDTO userDetails) {
        User user = new User(new ObjectId().toString(), userDetails.username(), userDetails.email(), userDetails.image(), userDetails.city(), userDetails.country(), false);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteUserById(id);
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User updateStatusUser(String id) {
        User oldUser = userRepository.findUserById(id);
        if (!oldUser.isStatus()) {
            oldUser.setStatus(true);
        } else {
            oldUser.setStatus(false);
        }
        return userRepository.save(oldUser);
    }
}
