package org.example;

import org.example.logica.Platillo;
import org.example.pesistencia.ControladoraPersistencia;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ControladoraPersistencia controladora = new ControladoraPersistencia();

        //Creamos dos obejtos de la clase platillo
        Platillo platillo1 = new Platillo(1L,"Calamares a la romana","Cortar calamares, rebozar y freir",24.00);
        Platillo platillo2 = new Platillo(2L,"Carne en salsa","Cortar carne, preparar salsa y guisar",20.00);
        Platillo platillo3 = new Platillo(3L,"Pizza","Preparar masa, echar ingredientes y meter en el horno",15.00);

        //Persistir los objetos

        controladora.crearPlatillo(platillo1);
        controladora.crearPlatillo(platillo2);
        controladora.crearPlatillo(platillo3);

        //Eliminar un platillo

        controladora.eliminarPlatillo(2L);

        //Editar

        platillo1.setNombre("Fajitas");
        platillo1.setReceta("Preparar las fajitas, concinar los ingredientes y servir");
        platillo1.setPrecio(30.00);
        controladora.editarPlatillo(platillo1);

        //Listar
        List<Platillo> listarPlatillos = controladora.listarPlatillos();
        for (Platillo platillo : listarPlatillos){
            System.out.println("Platillo: "+platillo.getNombre());
        }

    }
}