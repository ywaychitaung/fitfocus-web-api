package com.team10nus.web_api.service;

import com.team10nus.web_api.entity.User;

public interface UserService {
    boolean authenticate(String email, String password);

    User store(User user);
}
