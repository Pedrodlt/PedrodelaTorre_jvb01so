import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados = List.of(
                new Empleado("Pedro",1500.0,"Desarrollador"),
                new Empleado("Lorena",2500.0,"Gerente"),
                new Empleado ("Carlos",1700.0,"Analista"),
                new Empleado ("Gelen",1500.0,"Analista"),
                new Empleado("Alex",1400.0,"Desarrollador")
        );

        //Filtrar por categoria
        List<Empleado> empleadosFiltrados = empleados.stream()
                .filter(n->n.getSalario()>1400.0)
                .toList();

        System.out.println("Los empleados con salario superior a 1400 son: ");
        empleadosFiltrados.forEach(n-> System.out.println("Nombre: "+n.getNombre()+" - Salario: "+n.getSalario()));

        System.out.println("---------------");

        //Mapear por categoría y sacar el promedio
        Map<String,Double> promedio = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria, //usando groupingBy agrupamos por categoria similares
                        Collectors.averagingDouble(Empleado::getSalario))); // Dentro del collectors podemos usar el avaragingDouble para el promedio del salario

        //Para imprimir recorremos con un forEach, y utilizamos la par clave-valor para obtener los resultados
        System.out.println("Salario promedio por categoría: ");
        promedio.forEach((categoriaProm,salarioPromCat)->
                System.out.println(categoriaProm+": "+salarioPromCat));

        System.out.println("---------------");

        //Encontrar empleado con salario más alto. Con el .max comparamos el valor máximo en el orden de la lista
        Optional<Empleado> empleadoSalario = empleados.stream()
                .max((p1,p2)->Double.compare(p1.getSalario(),p2.getSalario()));

        empleadoSalario.ifPresent(n-> System.out.println("Empleado con el salario más alto: "+n.getNombre()+" - Salario: "+n.getSalario()));

        /*
        APUNTE DEL MÉTODO .MAX() ->
        El inconveniente del metodo .max() es que si dos empleados tuvieran el mismo salario máximo, cogería al que esté en primera
        posición de la lista, para imprimir ambos habría que mapear la lista, sacar el doble y filtrar por salario máximo repetido
        */

    }
}