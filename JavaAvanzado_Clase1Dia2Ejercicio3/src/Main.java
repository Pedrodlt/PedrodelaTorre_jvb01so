import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Introduzco los datos en el vector
        Datos[] datos = new Datos[5];

        datos[0]=new Datos("Pedro",33);
        datos[1]=new Datos("Juan",24);
        datos[2]=new Datos("Marta",34);
        datos[3]=new Datos("Sara",50);
        datos[4]=new Datos("Sonia",19);

        // Recorro el vector, imprimiendo los datos, en las posiciones que están vacias, me lanza una excepción con un mensaje

        for (int i = 0; i <= datos.length; i++) {
            try {
                System.out.println("Dato en la posición " + i + ": Nombre: "+datos[i].getNombre()+ " Edad: "+datos[i].getEdad());

            } catch (Exception e) {
                System.out.println("Error al acceder a la posición: "+i+" ya que no existe.");;
            }
        }
    }
}