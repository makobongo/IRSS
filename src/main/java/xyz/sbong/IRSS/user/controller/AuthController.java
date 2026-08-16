package xyz.sbong.IRSS.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.sbong.IRSS.user.entity.User;
import xyz.sbong.IRSS.user.service.AuthService;

@RestController
@RequestMapping("/api/user")
public class AuthController {
    @Autowired
    private AuthService authService;
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        authService.registerUser(user);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return authService.verifyUser(user);
    }
}
