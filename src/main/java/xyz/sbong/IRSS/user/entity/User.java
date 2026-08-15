package xyz.sbong.IRSS.user.entity;

import jakarta.persistence.*;
import lombok.*;
import xyz.sbong.IRSS.common.Auditable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Table(name = "users")
public class User extends Auditable {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String department;
    private String role;
    private Boolean isActive;
}
