package org.example.pesistencia;

import org.example.logica.Platillo;

import java.util.List;

public class ControladoraPersistencia {

    PlatilloJpaController platilloJpa = new PlatilloJpaController();

    public void crearPlatillo(Platillo platillo){
        platilloJpa.create(platillo);
    }

    public void eliminarPlatillo(Long id){
        platilloJpa.destroy(id);
    }

    public void editarPlatillo(Platillo platillo){
        platilloJpa.edit(platillo);

    }

    public List<Platillo> listarPlatillos(){
        return platilloJpa.findPlatilloEntities();
    }
}
