public class Main {
    public static void main(String[] args) {

        //Creamos los obejetos para agregarlos con los métodos agregarSubdirectorios y agregarArchivos
        Tarea proyecto = new Tarea("Desarrollo de Software");
        Tarea tareaPrincipal = new Tarea("Diseño de la Aplicación");
        Tarea subTarea1 = new Tarea("Crear Prototipo");
        Tarea subTarea2 = new Tarea("Diseñar Interfaz");
        Tarea subSubTarea3 = new Tarea("Definir esquema de colores");
        Tarea subSubTarea4 = new Tarea("Diseñar diseño responsivo ");

        //Añadimos las tareas
        proyecto.agregarSubtarea(tareaPrincipal);
        tareaPrincipal.agregarSubtarea(subTarea1);
        tareaPrincipal.agregarSubtarea(subTarea2);
        subTarea2.agregarSubtarea(subSubTarea3);
        subTarea2.agregarSubtarea(subSubTarea4);

        //Mostramos las tareas
        Tarea.mostrarTareas(tareaPrincipal,0);

    }
}