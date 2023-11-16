import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Hacemos la clase RegistroMascota utilizando el comodin con restricciones
public class RegistroMascota<T extends Mascota> {

    private List<Mascota<?>> mascotaList;

    public RegistroMascota() {
        this.mascotaList = new ArrayList<>();
    }

    //Agregamos mascotas a la lista pasando una mascota con comodín sin restricciones
    public void agregarMascota(Mascota<?> mascota){
        mascotaList.add(mascota);
        System.out.println("Mascota agregada con exito: "+mascota.getNombre()+ " es un "+mascota.getEspecie());
    }

    //Método para buscar la mascota por su nombre, creamos una lista de Mascota<?> recorremos con un forEach y
    //devovlemos el nombre de la mascota cuando lo encuentre.
    public List<Mascota<?>> buscarMascotaNombre (String nombre){

        List<Mascota<?>> mascotaNombre = new ArrayList<>();
        mascotaList.forEach(m->{
            if (m.getNombre().equalsIgnoreCase(nombre)){
                mascotaNombre.add(m);
            }
        });
        return mascotaNombre;
    }

    //Método para buscar la mascota por su nombre, creamos una lista de Mascota<?> recorremos con un forEach y
    //devovlemos el nombre de la mascota cuando lo encuentre.
    public List<Mascota<?>> buscarMascotaEspecie (Object especie){

        List<Mascota<?>> mascotaEspecie = new ArrayList<>();
        mascotaList.forEach(m->{
            if (m.getEspecie().equals(especie)){
                mascotaEspecie.add(m);
            }
        });
        return mascotaEspecie;
    }

    //Contar la cantidad de mascotas que hay en el registro. Para ello sacamos el tamaño de la lista y lo devolvemos
    // Utilizamos el .size() de la clase java.util.list para este cometido
    public int cantidadMascotas(){
        return mascotaList.size();
    }

    //Falta el apartado del Random, he probado varias soluciones pero no llega a quedarme claro, esperaré a ver la
    //solución propuesta y actualizaré el código

}
