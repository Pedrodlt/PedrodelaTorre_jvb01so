import java.util.ArrayList;
import java.util.List;

public class Tarea {

    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    //Método para agregar subtareas
    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    //He probado a usar este método, pero lanza un error, falta darle una vuelta a fondo y actualizar la solución
    public static void mostrarTareas(Tarea tarea, int nivel) {

        if (nivel == 0) {
            System.out.println("Proyecto: " + tarea.getNombre());
            System.out.println("|-- Tarea Principal: " + tarea.getNombre());
            System.out.println("|-- Subtarea: " + tarea.getNombre());
        }

        for (Tarea subtarea : tarea.getSubtareas()) {
            subtarea.mostrarTareas(tarea,nivel+1);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }
}
