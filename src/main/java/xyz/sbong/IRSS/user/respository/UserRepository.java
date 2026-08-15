package xyz.sbong.IRSS.user.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.sbong.IRSS.user.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
