package com.team10nus.web_api.service;

public interface UserService {
    boolean authenticate(String email, String password);
}
