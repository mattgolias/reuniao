package com.reuniao.localevent.repository;

import com.reuniao.localevent.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, UUID> {

    boolean existsByEmail(String email);
}