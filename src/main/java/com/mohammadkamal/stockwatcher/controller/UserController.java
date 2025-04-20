package com.mohammadkamal.stockwatcher.controller;

import com.mohammadkamal.stockwatcher.exception.ResourceNotFoundException;
import com.mohammadkamal.stockwatcher.model.User;
import com.mohammadkamal.stockwatcher.service.UserService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public void registerUser(@RequestBody User user){
        userService.registerUser(user);
    }

    @GetMapping("/email")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException("User with email: " + email + " not found"));
    }

    @GetMapping
    List<User> listAllUsers(){
        return userService.listAllUsers();
    }
}
