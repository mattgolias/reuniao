package com.reuniao.localevent.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "EVENTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nome", length = 100)
    @NotNull
    private String nome;

    @Column(name = "local", length = 50)
    @NotNull
    private String local;

    @Column(name = "categoria", length = 50)
    @NotNull
    private String categoria;

    @Column(name = "data", length = 10)
    @NotNull
    private String data;

    @Column(name = "horarioInicio", length = 10)
    @NotNull
    private String horarioInicio;

    @Column(name = "horarioFinal", length = 10)
    @NotNull
    private String horarioFinal;

    @Column(name = "vagas", length = 5)
    @NotNull
    private String vagas;

    @Column(name = "criadorDoEvento", length = 100)
    private String criadorDoEvento;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "inscritos", length = 100)
    @ElementCollection
    private List<Funcionario> inscritos;

    @Column(name = "quantidade", length = 5)
    private String quantidade;

    @Column(name = "start")
    private String start;

    @Column(name = "status")
    private String status;

    @Column(name = "date")
    private String date;

    @Column(name = "email")
    private String email;

}

