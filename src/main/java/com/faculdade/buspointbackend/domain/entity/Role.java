package com.faculdade.buspointbackend.domain.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(name = "role_name_unique", columnNames = { "name" }) })
public class Role {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 20, unique = true, nullable = false)
    private String name;

}
