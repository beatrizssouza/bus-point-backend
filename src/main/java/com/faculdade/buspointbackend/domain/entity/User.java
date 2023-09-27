package com.faculdade.buspointbackend.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(name = "user_username_unique", columnNames = { "username" }) }) public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

    @Column(name = "name", length = 50, nullable = false) private String name;

    @Column(name = "username", length = 50, nullable = false) private String username;

    @Column(name = "password", length = 100, nullable = false) private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey=@ForeignKey(name="fk_users_roles_user")),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id", foreignKey=@ForeignKey(name="fk_users_roles_role")))
    private List<Role> roles;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(Long id) {
        this.id = id;
    }

    public User() {

    }


}