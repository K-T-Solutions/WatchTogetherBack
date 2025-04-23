package com.KAndT.authorization.controller;

import com.KAndT.authorization.model.User;
import com.KAndT.authorization.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        User savedUser = userService.registerUser(user);
        return ResponseEntity.ok(savedUser);
    }
}
