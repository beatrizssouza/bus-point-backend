package com.faculdade.buspointbackend.services;

import com.faculdade.buspointbackend.config.JwtHelper;
import com.faculdade.buspointbackend.domain.dto.LoginRequest;
import com.faculdade.buspointbackend.domain.entity.User;
import com.faculdade.buspointbackend.exceptions.AppError;
import com.faculdade.buspointbackend.exceptions.AppException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    private final JwtHelper jwtHelper;
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    public LoginService(JwtHelper jwtHelper, PasswordEncoder passwordEncoder, UserService userService) {
        this.jwtHelper = jwtHelper;
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
    }

    public String login(LoginRequest loginRequest) {
        Optional<User> user = userService.findByUsername(loginRequest.username());

        if (!user.isPresent())
            throw AppException.of(AppError.INVALID_CREDENTIALS);

        boolean passwordIsValid = passwordEncoder.matches(loginRequest.password(), user.get().getPassword());
        if (!passwordIsValid) throw AppException.of(AppError.INVALID_CREDENTIALS);

        return jwtHelper.createJwt(user.get());
    }
}