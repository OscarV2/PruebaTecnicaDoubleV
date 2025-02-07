package com.example.demo.infrastructure.adapter;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.infrastructure.entity.TicketEntity;

public interface TicketCrudRepositorySQL extends JpaRepository<TicketEntity, Long> {

}
