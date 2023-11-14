import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Evento> eventos = Arrays.asList(
                new Evento("Reunión Equipo", LocalDate.of(2023, 11, 16), "Reunión"),
                new Evento("Conferencia Tech", LocalDate.of(2023, 11, 18), "Conferencia"),
                new Evento("Taller Programación", LocalDate.of(2023, 11, 20), "Taller"),
                new Evento("Reunión Clientes", LocalDate.of(2023, 11, 15), "Reunión"),
                new Evento("Conferencia Design", LocalDate.of(2023, 11, 14), "Conferencia")
        );

        //Filtrar los eventos por una fecha
        List<Evento> eventoFecha = eventos.stream()
                .filter(n->n.getFecha().equals(LocalDate.of(2023,11,15)))
                .toList();

        System.out.println("Los eventos con fecha 2023-11-15 son:");
        eventoFecha.forEach(n-> System.out.println("Evento: "+n.getNombre()+" - Categoria: "+n.getCategoria()));

        System.out.println("-----------");

        //Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        //Mapeamos los eventos, pasamos un String y un Long (hay que utilizar Long para poder usar el counting)
        Map<String,Long> eventoCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria,Collectors.counting()));

        System.out.println("Los enventos agrupados por categoría son:");
        eventoCategoria.forEach((catEvento,cantiEvento)-> System.out.println("De la categoria: "+catEvento+ " hay en total: "+cantiEvento));

        System.out.println("-----------");

        //Encuentra el evento más próximo en el tiempo utilizando Optionals
        //Filtramos por la fecha mas próxima a la fecha de hoy, comparamos las fechas y elegimos la que más cercana sea
        Optional<Evento> eventoProximo = eventos.stream()
                .filter(n->n.getFecha().isAfter(LocalDate.now()))
                .min(Comparator.comparing(Evento::getFecha));//Similar a f->f.getFecha()

        eventoProximo.ifPresentOrElse(//Con el ifPresentOrElse, primero imprimimos el evento próximo y luego el mensaje en caso de que no haya fecha
                n-> System.out.println("El evento más próximo es: "+n.getNombre()+" con fecha: "+n.getFecha()),
                ()-> System.out.println("No hay evento con fecha válida.")
        );
        /*
        APUNTE .MIN()
        Con .min pasa lo mismo que con .max, en caso de que dos fechas sean el mismo día, nos devolvera la primera de la lista en posición
         */

    }
}