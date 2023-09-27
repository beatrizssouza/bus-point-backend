package com.faculdade.buspointbackend.domain.dto;

import java.util.List;

public record AuthenticatedUserDetails(Long id, String name, List<String> roles) { }