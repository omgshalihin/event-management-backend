package com.salt.hackday.controller;

import com.salt.hackday.model.User;
import com.salt.hackday.model.UserDTO;
import com.salt.hackday.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    ResponseEntity<User> createUser(@RequestBody UserDTO userDetails) {
        User createdUser = userService.createUser(userDetails);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping
    ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    ResponseEntity<User> getUserById(@PathVariable String id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @PatchMapping("/{id}")
    ResponseEntity<User> updateStatusUser(@PathVariable String id) {
        User updatedStatus = userService.updateStatusUser(id);
        return ResponseEntity.accepted().body(updatedStatus);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
