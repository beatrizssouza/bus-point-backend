package com.faculdade.buspointbackend.domain.dto;

public class TokenResponse {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenResponse(String token) {
        this.token = token;
    }

    public TokenResponse() {
    }
}
