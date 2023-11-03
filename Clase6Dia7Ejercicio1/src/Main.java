import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creacion del ArrayList
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        //Añadir al ArrayList un nuevo objeto de cada tipo.
        vehiculos.add(new Auto(1,"1234HST","Renault","XPR5",2021,35000.00,40000,12));
        vehiculos.add(new Camioneta(2,"4567JLM","Mercedes","Vito",2015,20000.00,75,32.00));
        vehiculos.add(new Moto(3,"8907EUI","Yamaha","XTR",1998,3000.00,250,"Sport"));

        //Recorremos el Array y mostramos los datos:
        for(Vehiculo vehiculo : vehiculos){
            System.out.println("El vehículo con ID: "+vehiculo.getId()+" de marca: "+vehiculo.getMarca()+", y modelo: "
            +vehiculo.getModelo()+ " tiene una antiguedad de "+vehiculo.calcularAntiguedad()+" años y su carga de " +
                    "energia/combustible es: ");
            if(vehiculo instanceof Electrico){
                ((Electrico) vehiculo).cargarEnergia();
            }else{
                ((Combustion)vehiculo).recargarCombustible();
            }
        }



    }
}