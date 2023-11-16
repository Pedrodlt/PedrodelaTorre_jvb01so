public class Main {
    public static void main(String[] args) {

        //Creamos los obejetos para agregarlos con los métodos agregarSubdirectorios y agregarArchivos
        Directorio directorioPrincipal = new Directorio(1,"Directorio Principal -> Nivel 1");
        Directorio subDirectorio1 = new Directorio(2,"Sub-Directorio 1 -> Nivel 2");
        Directorio subDirectorio2 = new Directorio(3,"Sub-Directorio 2 -> Nivel 2");
        String archivo1 = "Archivo 1 -> Nivel 3";
        String archivo2 = "Archivo 2 -> Nivel 3";

        directorioPrincipal.agregarSubdirectorios(subDirectorio1);
        directorioPrincipal.agregarSubdirectorios(subDirectorio2);
        subDirectorio1.agregarArchivos(archivo1);
        subDirectorio2.agregarArchivos(archivo2);

        // Llamamos al método explorar directorios para recorrer los diferentes niveles
        ExploradorDirectorios.explorarDirectorios(directorioPrincipal);



    }
}