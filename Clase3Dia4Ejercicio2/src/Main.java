public class Main {
    public static void main(String[] args) {

        Persona [] personas = new Persona [5];

        personas[0] = new Persona(1,"Pedro",33, "Calle 1", 666555444);
        personas[1] = new Persona(2,"Juan",35, "Calle 2", 666555444);
        personas[2] = new Persona(3,"Julia",26, "Calle 3", 666555444);
        personas[3] = new Persona(4,"Marta",31, "Calle 4", 666555444);
        personas[4] = new Persona(5,"Pablo",22, "Calle 5", 666555444);

        //Recorremos y mostramos los datos almacenados en el vector
        for (int i = 0; i < personas.length; i++) {
            System.out.println("El nombre es: "+personas[i].getNombre()+ " y su edad es: "+personas[i].getEdad());
        }
        //Cambiamos los nombres de dos personas
        personas[1].setNombre("Miguel");
        personas[3].setNombre("Laura");
        //Recorremos y mostramos los datos con los nombres cambiados
        System.out.println("Los datos con los nombres cambiados son: ");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("El nombre es: "+personas[i].getNombre()+ " y su edad es: "+personas[i].getEdad());
        }

        //Mostramos a las personas que tengan más de 30 años
        System.out.println("Personas con más de 30 años: ");
        for (int i = 0; i < personas.length; i++) {
            if(personas[i].getEdad()>30){
                System.out.println("El nombre es: "+personas[i].getNombre()+ " y su edad es: "+personas[i].getEdad());
            }
        }
    }
}