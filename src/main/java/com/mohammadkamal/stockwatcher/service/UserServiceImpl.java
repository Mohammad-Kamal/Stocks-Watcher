package com.mohammadkamal.stockwatcher.service;

import com.mohammadkamal.stockwatcher.repository.UserRepository;
import com.mohammadkamal.stockwatcher.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(User user) {
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if(existingUser.isPresent()){
            throw new RuntimeException("User with this email " + user.getEmail() + " is already exist.");
        }
        userRepository.save(user);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }
}
