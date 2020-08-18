package com.vhaibrother.vehicle_client_mng.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ColorDto {
    private Long id;
    @NotEmpty(message = "Name is mandatory")
    private String colorName;
}
