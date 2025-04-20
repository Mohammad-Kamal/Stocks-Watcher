package com.mohammadkamal.stockwatcher.service;

import com.mohammadkamal.stockwatcher.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public void registerUser(User user);
    public Optional<User> getUserByEmail(String email);
    public List<User> listAllUsers();

}
