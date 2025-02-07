package com.example.demo.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Ticket implements Serializable {

    private static final long serialVersionUID = -1082469343416464566L;

    private Long id;
    private String usuario;
    private String estatus;
    private LocalDateTime fechaCreacion;
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
