package com.team10nus.web_api.dto;

public class LoginRequest {
    // Attributes
    private String email;
    private String password;

    // Empty Constructor
    public LoginRequest() {}

    // Constructor Overloading
    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters & Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
