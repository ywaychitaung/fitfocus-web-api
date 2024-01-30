package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.User;
import com.team10nus.web_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AuthApiController {
    @Autowired
    private UserService userService;

    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestParam String email, @RequestParam String password) {
        boolean isAuthenticated = userService.authenticate(email, password);
        if (isAuthenticated) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    @PostMapping("/auth/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        try {
            User newUser = userService.store(user);
            return ResponseEntity.ok("User registered successfully with ID: " + newUser.getUserId());
        } catch (Exception e) {
            // Exception handling can be more specific based on what exceptions your service throws
            return ResponseEntity.badRequest().body("Registration failed: " + e.getMessage());
        }
    }
}
