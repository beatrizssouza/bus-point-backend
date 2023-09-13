package com.faculdade.buspointbackend.dto;

import com.faculdade.buspointbackend.entity.UsersEntity;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UsersResponseDTO {

    public UsersResponseDTO(UsersEntity users) {
        this.id = users.getId();
        this.name = users.getName();
        this.email = users.getEmail();
        this.phone = users.getPhone();
    }

    private int id;

    private String name;

    private String email;

    private String phone;


}
