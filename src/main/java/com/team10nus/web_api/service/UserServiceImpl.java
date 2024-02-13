package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.User;
import com.team10nus.web_api.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(int userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public boolean authenticate(String email, String password) {
        // Find the user by email
        User user = userRepository.findByEmail(email);

        String hashedPassword = user.getPassword();

        return checkPassword(password, hashedPassword);
    }

    public boolean checkPassword(String password, String hashedPassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(password, hashedPassword);
    }

    @Override
    public User store(User user) {
        // Create a new user object
        User newUser = new User();

        // Set the properties from the request body
        newUser.setUsername(user.getUsername());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());

        // Save the new user
        return userRepository.save(newUser);
    }
}
