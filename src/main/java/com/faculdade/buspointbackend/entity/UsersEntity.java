package com.faculdade.buspointbackend.entity;
import com.faculdade.buspointbackend.dto.UsersDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="TB_USUARIOS")
@Data
@NoArgsConstructor
public class UsersEntity {

    public UsersEntity(UsersDTO usersDTO){
        this.name = usersDTO.getName();
        this.email = usersDTO.getEmail();
        this.password = usersDTO.getPassword();
        this.phone = usersDTO.getPhone();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "Phone")
    private String phone;

}
