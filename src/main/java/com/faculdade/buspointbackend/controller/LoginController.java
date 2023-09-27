package com.faculdade.buspointbackend.controller;

import com.faculdade.buspointbackend.domain.dto.LoginRequest;
import com.faculdade.buspointbackend.domain.dto.TokenResponse;
import com.faculdade.buspointbackend.services.LoginService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("api/login")
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public TokenResponse login(@RequestBody @Valid LoginRequest loginRequest){
        return new TokenResponse(loginService.login(loginRequest));
    }
}

