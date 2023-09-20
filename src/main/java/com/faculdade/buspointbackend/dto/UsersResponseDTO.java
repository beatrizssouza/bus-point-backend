package com.faculdade.buspointbackend.dto;

import com.faculdade.buspointbackend.entity.UsersEntity;
import lombok.Data;

@Data
public class UsersResponseDTO {

    public UsersResponseDTO(UsersEntity users) {
        this.id = users.getId();
        this.username = users.getUsername();
        this.email = users.getEmail();
        this.phone = users.getPhone();
    }

    private int id;

    private String username;

    private String email;

    private String phone;


}
