package com.example.demo.aplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Ticket;
import com.example.demo.domain.port.TicketRepositoryPort;

@Service
public class DomainTicketService implements TicketService {

    @Autowired
    private TicketRepositoryPort ticketRepositoryPort;

    @Override
    public Ticket save(Ticket ticket) {
	return ticketRepositoryPort.save(ticket);
    }

    @Override
    public void saveAll(List<Ticket> tickets) {
	ticketRepositoryPort.saveAll(tickets);

    }

    @Override
    public Ticket getTicketById(Long id) {
	return ticketRepositoryPort.getTicketById(id);
    }

    @Override
    public void deleteTicketById(Long id) {
	ticketRepositoryPort.deleteTicketById(id);

    }

    @Override
    public List<Ticket> getAll() {
	return ticketRepositoryPort.getAll();
    }

    @Override
    public List<Ticket> getAllPaginated(Pageable pageable) {
	return ticketRepositoryPort.getAllPaginated(pageable);
    }

}
