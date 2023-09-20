package com.faculdade.buspointbackend.dto;

import com.faculdade.buspointbackend.entity.UsersEntity;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class User {

    public User(UsersEntity users) {
        this.username = users.getUsername();
        this.password = users.getPassword();
    }

    private String username;

    private String password;

}
