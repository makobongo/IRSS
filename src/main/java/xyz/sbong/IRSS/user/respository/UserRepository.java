package xyz.sbong.IRSS.user.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import xyz.sbong.IRSS.user.dto.UserDto;
import xyz.sbong.IRSS.user.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    @Query("SELECT new xyz.sbong.IRSS.user.dto.UserDto(u.id, u.firstName, u.lastName, u.email, u.phoneNumber, u.department, u.role, u.isActive) FROM User u")
    List<UserDto> fetchAllUsers();
}
