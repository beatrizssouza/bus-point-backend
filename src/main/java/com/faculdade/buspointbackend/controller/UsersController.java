package com.faculdade.buspointbackend.controller;
import com.faculdade.buspointbackend.dto.ResponseBase;
import com.faculdade.buspointbackend.dto.UsersDTO;
import com.faculdade.buspointbackend.dto.UsersResponseDTO;
import com.faculdade.buspointbackend.entity.UsersEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.faculdade.buspointbackend.repository.UsersRepository;
import com.faculdade.buspointbackend.services.UsersServices;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class UsersController {

    private final UsersServices service;
    //Criar usuarios
    @PostMapping("/create")
    public ResponseEntity<UsersResponseDTO> postUsers (@RequestBody @Valid UsersDTO usersDTO){
        var result = service.createUsers(usersDTO);
        return ResponseEntity.ok(result);
    }

    @GetMapping("")
    public ResponseEntity<ResponseBase<List<UsersEntity>>>getUsers(){
        var result = service.listAllUsers();
        return ResponseEntity.ok(result);
    }
}
