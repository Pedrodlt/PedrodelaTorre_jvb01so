import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RegistroMascota<Mascota> mascotaRegistrada = new RegistroMascota<>();

        //Agregar mascotas al registro

        mascotaRegistrada.agregarMascota(new Mascota<>(1,"Syra",5,"Perro"));
        mascotaRegistrada.agregarMascota(new Mascota<>(2,"Gandalf",7,"Gato"));
        mascotaRegistrada.agregarMascota(new Mascota<>(3,"Cuco",3,"Ave"));
        mascotaRegistrada.agregarMascota(new Mascota<>(4,"Donatello",15,"Reptil"));

        System.out.println("-------------");

        //Buscar mascota por nombre.
        List<Mascota<?>> mascotaNombre = mascotaRegistrada.buscarMascotaNombre("Gandalf");
        mascotaNombre.forEach(m-> System.out.println("Nombre: "+m.getNombre()+" Edad: "+m.getEdad()));

        System.out.println("-------------");

        //Buscar mascota por especie.
        List<Mascota<?>> mascotaEspecie = mascotaRegistrada.buscarMascotaEspecie("Ave");
        mascotaEspecie.forEach(m-> System.out.println("Nombre: "+m.getNombre()+" Especie: "+m.getEspecie()));

        System.out.println("-------------");

        //Contar la cantidad total de mascotas en el registro
        System.out.println("La cantidad de mascotas en el registro es: "+mascotaRegistrada.cantidadMascotas());

        System.out.println("-------------");

        //Falta el apartado del Random, he probado varias soluciones pero no llega a quedarme claro, esperaré a ver la
        //solución propuesta y actualizaré el código
    }
}