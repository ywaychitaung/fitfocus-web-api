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
        Optional<User> user = userRepository.findByEmail(email);
        if(user != null && password.equals(user.get().getPassword()))
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean register(User user) {

        if (userRepository.findByEmail(user.getEmail())!=null)
        {

            return false;
        }
    
        User savedUser = userRepository.save(user);
        return savedUser !=null;
    }
}
