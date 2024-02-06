package com.team10nus.web_api.controller.api;

import com.team10nus.web_api.entity.User;
import com.team10nus.web_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserApiController {
    @Autowired
    private UserService userService;

    @GetMapping("/show/{userId}")
    public ResponseEntity<User> show(@PathVariable("userId") Integer userId) {
        User user = userService.getUserById(userId);

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
