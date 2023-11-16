public class ExploradorDirectorios {

    //Con este método recorremos las listas tanto de los directorios como de los archivos, utilizando la recursividad
    //al volver a llamar al mismo método. Cuando hay un archivo introducido lo impriminos directamente
    public static void explorarDirectorios(Directorio directorio){

        System.out.println("ID: " + directorio.getId() + ", Nombre: " + directorio.getNombre());

        for (Directorio subdirectorio : directorio.getSubdirectorios()) {
            explorarDirectorios(subdirectorio);
            
        }
        for (String archivo : directorio.getArchivos()) {
            System.out.println("Archivo: " + archivo);
        }
    }
}
