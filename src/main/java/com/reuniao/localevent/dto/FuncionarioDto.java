package com.reuniao.localevent.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FuncionarioDto {

    @NotBlank
    private String nome;

    @NotBlank
    private String email;
}