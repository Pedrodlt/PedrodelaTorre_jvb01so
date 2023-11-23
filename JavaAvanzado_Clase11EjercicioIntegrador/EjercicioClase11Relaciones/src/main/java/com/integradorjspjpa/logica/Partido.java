/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integradorjspjpa.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author pedro
 */
@Entity
public class Partido implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    private Integer resultado_local;
    private Integer resultado_visitante;

    // Otros atributos y métodos

    @ManyToOne
    @JoinColumn(name = "equipo_local_id")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visitante_id")
    private Equipo equipoVisitante;

    public Partido() {
    }

    public Partido(Long id, String fecha, Integer resultado_local, Integer resultado_visitante, Equipo equipoLocal, Equipo equipoVisitante) {
        this.id = id;
        this.fecha = fecha;
        this.resultado_local = resultado_local;
        this.resultado_visitante = resultado_visitante;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getResultado_local() {
        return resultado_local;
    }

    public void setResultado_local(Integer resultado_local) {
        this.resultado_local = resultado_local;
    }

    public Integer getResultado_visitante() {
        return resultado_visitante;
    }

    public void setResultado_visitante(Integer resultado_visitante) {
        this.resultado_visitante = resultado_visitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    
    
    
    
}
