package com.example.demo.infrastructure.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tickets")
public class TicketEntity implements Serializable {

    private static final long serialVersionUID = 1700770841903942472L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String usuario;
    private String estatus;
    @CreatedDate
    @Column(name = "fecha_creacion", updatable = false)
    @CreationTimestamp
    private LocalDateTime fechaCreacion;
    @LastModifiedDate
    @UpdateTimestamp
    private LocalDateTime fechaActualizacion;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getUsuario() {
	return usuario;
    }

    public void setUsuario(String usuario) {
	this.usuario = usuario;
    }

    public String getEstatus() {
	return estatus;
    }

    public void setEstatus(String estatus) {
	this.estatus = estatus;
    }

    public LocalDateTime getFechaCreacion() {
	return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
	return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
	this.fechaActualizacion = fechaActualizacion;
    }

}
