package com.example.demo.aplication.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.example.demo.domain.model.Ticket;

public interface TicketService {

    Ticket save(Ticket ticket);

    void saveAll(List<Ticket> ticket);

    Ticket getTicketById(Long id);

    void deleteTicketById(Long id);

    List<Ticket> getAll();

    List<Ticket> getAllPaginated(Pageable pageable);
}
