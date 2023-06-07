package com.reuniao.localevent.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class EmailDto {

    @NotBlank
    private String email;
}
