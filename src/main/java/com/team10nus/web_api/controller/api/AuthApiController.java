package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.dto.LoginRequest;
import com.team10nus.web_api.entity.User;
import com.team10nus.web_api.service.UserService;
import com.team10nus.web_api.util.JsonUtil;
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
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        // Authenticate the user
        boolean isAuthenticated = userService.authenticate(loginRequest.getEmail(), loginRequest.getPassword());

        // Return the response
        if (isAuthenticated) {
            // Get the user object
            User user = userService.getUserByEmail(loginRequest.getEmail());

            // Convert the user object to JSON string
            String userJson = JsonUtil.convertObjectToJson(user);

            // Return the JSON string as the response body
            return ResponseEntity.ok(userJson);
        } else {
            // Return the error message as the response body
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    @PostMapping("/auth/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        try {
            // Store the new user
            User newUser = userService.store(user);

            // Convert the user object to JSON string
            String userJson = JsonUtil.convertObjectToJson(newUser);

            // Return the JSON string as the response body
            return ResponseEntity.ok(userJson);
        } catch (Exception e) {
            // Return the error message as the response body
            return ResponseEntity.badRequest().body("Registration failed: " + e.getMessage());
        }
    }

    @PostMapping("/auth/logout")
    public ResponseEntity<?> logout() {
        // Return the response
        return ResponseEntity.ok("Logged out successfully");
    }
}

