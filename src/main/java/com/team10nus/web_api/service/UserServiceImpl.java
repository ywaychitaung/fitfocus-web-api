package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.User;
import com.team10nus.web_api.repository.UserRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean authenticate(String email, String password) {
        User user = userRepository.findByEmail(email);
        return user != null && password.equals(user.getPassword());
    }

    public User store(User user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());

        return userRepository.save(newUser);
    }
}
