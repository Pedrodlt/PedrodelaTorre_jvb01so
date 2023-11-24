/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.votacion.votacionpartido.persistencia;


import com.votacion.votacionpartido.logica.Votacion;
import com.votacion.votacionpartido.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class ControladoraPersistencia {
    
     VotacionJpaController votaJPA = new VotacionJpaController();
    
    public void crearVotacion (Votacion votacion) {
        votaJPA.create(votacion);
    }
    
    public void eliminarVotacion (Long id) {
        try {
            votaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Votacion> traerVotaciones () {
    return votaJPA.findVotacionEntities();
    }
    
    public void editarVotacion (Votacion votacion) {
        try {
            votaJPA.edit(votacion);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
