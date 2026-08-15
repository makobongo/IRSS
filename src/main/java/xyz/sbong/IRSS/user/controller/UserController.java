package xyz.sbong.IRSS.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.sbong.IRSS.user.dto.UserDto;
import xyz.sbong.IRSS.user.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<UserDto> getUsers() {
        return userService.getAllUsers();
    }
}
