package com.example.registrationsecurity.controller;

import com.example.registrationsecurity.entity.User;
import com.example.registrationsecurity.repo.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserRepository userRepository,
                          PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {

        String encodedPassword =
                passwordEncoder.encode(user.getPassword());

        user.setPassword(encodedPassword);

        userRepository.save(user);

        return "User registered successfully";
    }
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User existingUser =
                userRepository.findByUsername(user.getUsername());

        if (existingUser == null) {
            return "User not found";
        }

        if (passwordEncoder.matches(
                user.getPassword(),
                existingUser.getPassword())) {

            return "Login successful";
        }

        return "Invalid username or password";
    }
}