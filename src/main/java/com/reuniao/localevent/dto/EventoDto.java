package com.reuniao.localevent.dto;

import com.reuniao.localevent.model.Funcionario;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class EventoDto {

    @NotBlank
    private String nome;

    @NotBlank
    private String local;

    @NotBlank
    private String categoria;

    @NotBlank
    private String data;

    @NotBlank
    private String horarioInicio;

    @NotBlank
    private String horarioFinal;

    @NotBlank
    private String vagas;

    private String criadorDoEvento;

    private String descricao;

    private List<Funcionario> inscritos;

    private String quantidade;

    private String start;

    private String status;

    private String date;

    private String email;

}
