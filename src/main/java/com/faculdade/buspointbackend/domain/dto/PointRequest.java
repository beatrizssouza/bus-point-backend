package com.faculdade.buspointbackend.domain.dto;

import javax.validation.constraints.NotEmpty;

public record PointRequest(@NotEmpty String namePoint, @NotEmpty String lat, @NotEmpty String lng) { }
