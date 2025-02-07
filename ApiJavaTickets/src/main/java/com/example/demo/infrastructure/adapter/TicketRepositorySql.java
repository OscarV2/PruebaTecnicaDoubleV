package com.example.demo.infrastructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Ticket;
import com.example.demo.domain.port.TicketRepositoryPort;
import com.example.demo.infrastructure.entity.TicketEntity;
import com.example.demo.infrastructure.mapper.TicketMapper;

@Service
public class TicketRepositorySql implements TicketRepositoryPort {

    @Autowired
    private TicketCrudRepositorySQL ticketCrudRepositorySQL;

    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public Ticket save(Ticket ticket) {
	TicketEntity ticketEntity = this.ticketMapper.toTicketEntity(ticket);
	return this.ticketMapper.toTicket(ticketCrudRepositorySQL.save(ticketEntity));
    }

    @Override
    public void saveAll(List<Ticket> tickets) {
	if (!tickets.isEmpty()) {
	    this.ticketCrudRepositorySQL.saveAll(this.ticketMapper.toTicketEntities(tickets));
	}
    }

    @Override
    public Ticket getTicketById(Long id) {
	Optional<TicketEntity> optTicketEntity = this.ticketCrudRepositorySQL.findById(id);
	return optTicketEntity.isPresent() ? this.ticketMapper.toTicket(optTicketEntity.get()) : null;
    }

    @Override
    public void deleteTicketById(Long id) {
	ticketCrudRepositorySQL.deleteById(id);
    }

    @Override
    public List<Ticket> getAll() {
	return this.ticketMapper.toTickets(this.ticketCrudRepositorySQL.findAll());
    }

    @Override
    public List<Ticket> getAllPaginated(Pageable pageable) {
	Page<TicketEntity> page = this.ticketCrudRepositorySQL.findAll(pageable);
	return this.ticketMapper.toTickets(page.getContent());
    }

}
