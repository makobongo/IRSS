package xyz.sbong.IRSS.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import xyz.sbong.IRSS.user.dto.UserDto;
import xyz.sbong.IRSS.user.entity.User;
import xyz.sbong.IRSS.user.respository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDto> getAllUsers() {
        return userRepository.fetchAllUsers();
    }
}
