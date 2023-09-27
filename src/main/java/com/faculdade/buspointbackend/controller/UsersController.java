package com.faculdade.buspointbackend.controller;
import com.faculdade.buspointbackend.domain.dto.ResponseBase;
import com.faculdade.buspointbackend.domain.entity.User;
import com.faculdade.buspointbackend.services.UserService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("api/users")
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RolesAllowed("ADMIN_USER")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }
}
