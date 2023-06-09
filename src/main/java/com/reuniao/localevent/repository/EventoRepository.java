package com.reuniao.localevent.repository;

import com.reuniao.localevent.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EventoRepository extends JpaRepository<Evento, UUID> {


    boolean existsByDataAndLocalAndHorarioInicio(String data, String local, String HorarioInicio);
}
