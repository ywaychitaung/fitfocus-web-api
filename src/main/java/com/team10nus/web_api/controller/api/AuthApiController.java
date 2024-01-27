package com.team10nus.web_api.controller.api;

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
}
