/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.votacion.votacionpartido.logica;

import com.votacion.votacionpartido.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author pedro
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    //Traemos los votos y los guardamos en una lista votos
    private List<Votacion> votos = controlPersis.traerVotaciones();
    
     public void crearVotacion (Votacion votacion) {
        controlPersis.crearVotacion(votacion);
    }
    
    public void eliminarVotacion (Long id) {
        controlPersis.eliminarVotacion(id);
    }
    
    public List<Votacion> traerVotacion () {
        return controlPersis.traerVotaciones();
    }
    
    public void editarVotacion (Votacion votacion) {
        controlPersis.editarVotacion(votacion);
    }
    
    public List<Votacion> filtrarPartido(String partido){
        List <Votacion> votacionesCoincidentes =controlPersis.traerVotaciones().stream()
                 .filter(p->p.getPartido().equalsIgnoreCase(partido))
                 .toList(); 
        return votacionesCoincidentes;
    
    }
    
    //Método para mapear los botos ingresados y la cantidad de ellos
    public Map<String, Integer> obtenerCantidadVotosPorPartido() {
        Map<String, Integer> cantidadPorPartido = new HashMap<>();
        //Recorremos la lista votos con las votaciones y utilizamos el put para actualizar cada voto
        //y el número de ellos en cantidadPorPartido, que lo devolvemos para utilizarlo en el Servlet
        for (Votacion voto : votos) {
            String partido = voto.getPartido();
            cantidadPorPartido.put(partido, cantidadPorPartido.getOrDefault(partido, 0) + 1);
        }
        return cantidadPorPartido;
  }
}
