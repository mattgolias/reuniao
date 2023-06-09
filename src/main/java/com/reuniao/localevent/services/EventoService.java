package com.reuniao.localevent.services;

import com.reuniao.localevent.model.Evento;
import com.reuniao.localevent.repository.EventoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventoService {
    final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository){
        this.eventoRepository = eventoRepository;
    }

    @Transactional
    public Evento save(Evento evento) {
        System.out.println(evento.getVagas());
        return eventoRepository.save(evento);
    }


    public boolean existByDataAndLocalAndHorarioInicio(String data, String local, String horarioInicio) {
        return eventoRepository.existsByDataAndLocalAndHorarioInicio(data, local, horarioInicio);
    }

    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    public Optional<Evento> findById(UUID id) {
        return eventoRepository.findById(id);
    }

    @Transactional
    public void delete(Evento evento) {
        eventoRepository.delete(evento);
    }
}
