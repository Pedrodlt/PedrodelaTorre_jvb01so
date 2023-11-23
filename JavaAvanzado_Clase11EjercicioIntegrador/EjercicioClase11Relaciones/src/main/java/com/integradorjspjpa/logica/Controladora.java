/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integradorjspjpa.logica;

import com.integradorjspjpa.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //Para Equipos
    
     public void crearEquipo (Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }
    
    public void eliminarEquipo (Long id) {
        controlPersis.eliminarEquipo(id);
    }
    
    public List<Equipo> traerEquipo() {
        return controlPersis.traerEquipos();
    }
    
    public void editarEquipo (Equipo equipo) {
        controlPersis.editarEquipo(equipo);
    }
    
    public List<Equipo> mostrarEquipos(){
        List <Equipo> equiposCoincidentes =controlPersis.traerEquipos().stream()
                 
                 .toList(); 
        return equiposCoincidentes;
    
    }
    
    //Para Partidos
    
    public void crearPartido(Partido partido, Long idEquipoLocal, Long idEquipoVisitante) {
        //A partir de los IDs se obtienen los equipos
        Equipo equipo1 = controlPersis.ObtenerEquipo(idEquipoLocal);
        Equipo equipo2 = controlPersis.ObtenerEquipo(idEquipoVisitante);
        //Los seteamos en el partido antes de persistir
        partido.setEquipoLocal(equipo1);
        partido.setEquipoVisitante(equipo2);
        //Creamos el partido
        controlPersis.crearPartido(partido);
    }    
    
    public void crearPartido (Partido partido) {
        controlPersis.crearPartido(partido);
    }
    
    public void eliminarPartido (Long id) {
        controlPersis.eliminarPartido(id);
    }
    
    public List<Partido> traerPartido () {
        return controlPersis.traerPartido();
    }
    
    public void editarPartido (Partido partido) {
        controlPersis.editarPartido(partido);
    }
    
    public List<Partido> filtrarFecha(String fecha){
        List <Partido> fechaCoincidente =controlPersis.traerPartido().stream()
                 .filter(p->p.getFecha().equalsIgnoreCase(fecha))
                 .toList(); 
        return fechaCoincidente;
    
    }
}
