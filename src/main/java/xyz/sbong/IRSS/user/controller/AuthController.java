package xyz.sbong.IRSS.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class AuthController {
    @PostMapping("/register")
    public String register() {
        return "Registration successful";
    }

    @PostMapping("/login")
    public String login() {
        return "Login successful";
    }
}
