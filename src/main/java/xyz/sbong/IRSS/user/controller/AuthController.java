package xyz.sbong.IRSS.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.sbong.IRSS.user.entity.User;
import xyz.sbong.IRSS.user.service.UserService;

@RestController
@RequestMapping("/api/user")
public class AuthController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.registerUser(user);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String login() {
        return "Login successful";
    }
}
