package com.example.demo.infrastructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.demo.domain.model.Ticket;
import com.example.demo.infrastructure.entity.TicketEntity;

//@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
@Mapper
public interface TicketMapper {

    @Mappings({ @Mapping(source = "id", target = "id"), @Mapping(source = "usuario", target = "usuario"),
	    @Mapping(source = "estatus", target = "estatus"),
	    @Mapping(source = "fechaCreacion", target = "fechaCreacion"),
	    @Mapping(source = "fechaActualizacion", target = "fechaActualizacion") })
    Ticket toTicket(TicketEntity ticketEntity);

    List<Ticket> toTickets(List<TicketEntity> ticketEntities);

    @InheritInverseConfiguration
    TicketEntity toTicketEntity(Ticket ticket);

    @InheritInverseConfiguration
    List<TicketEntity> toTicketEntities(List<Ticket> tickets);
}
