package com.salt.hackday.service;

import com.salt.hackday.model.User;
import com.salt.hackday.model.UserDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    User createUser(UserDTO userDetails);

    List<User> getAllUsers();


    void deleteUser(String id);

    User getUserById(String id);

    User updateStatusUser(String id);
}
