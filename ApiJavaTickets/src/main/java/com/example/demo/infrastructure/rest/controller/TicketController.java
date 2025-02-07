package com.example.demo.infrastructure.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.aplication.service.TicketService;
import com.example.demo.domain.model.Ticket;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/tickets")
@Slf4j
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public ResponseEntity<List<Ticket>> getTickets() {
	return new ResponseEntity<>(this.ticketService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ticket> save(@RequestBody Ticket ticket) {
	return new ResponseEntity<>(ticketService.save(ticket), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable Long id) {
	return new ResponseEntity<>(this.ticketService.getTicketById(id), HttpStatus.OK);
    }

    @GetMapping("/paginated")
    public ResponseEntity<List<Ticket>> getPaginated(@RequestParam Integer page, @RequestParam Integer size) {
	Pageable pageable = PageRequest.of(page, size);
	return new ResponseEntity<>(this.ticketService.getAllPaginated(pageable), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
	this.ticketService.deleteTicketById(id);
    }

}
