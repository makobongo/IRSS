package xyz.sbong.IRSS.user.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/login")
    public String csrfToken(HttpServletRequest request) {
//        return authService.verifyUser(user);
        return "User login successful "+request.getSession().getId();
//        return (CsrfToken) request.getAttribute("_csrf");
    }
}
