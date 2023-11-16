import java.util.List;

public class Main {
    public static void main(String[] args) {

        InventarioAutos<Auto> inventarioAuto = new InventarioAutos<>();

        //Agregar auntos con el metodo .agregarAuto()
        inventarioAuto.agregarAuto(new Auto("Renault","Megane",2023,20000.00));
        inventarioAuto.agregarAuto(new Auto("Ford","Fiesta",2015,10000.00));
        inventarioAuto.agregarAuto(new Auto("Hyundai","I30",2017,18000.00));
        inventarioAuto.agregarAuto(new Auto("Kia","Picanto",2023,5000.00));

        System.out.println("--------------");

        // Buscar autos por marca
        List<Auto> autoMarcaEncontrado = inventarioAuto.buscarAutoMarca("Renault");
        autoMarcaEncontrado.forEach(n->System.out.println("Auto de la marca "+n.getMarca()+ " encontrado: " + n.getModelo()));

        System.out.println("--------------");

        // Buscar autos por año
        List<Auto> autoYearEncontrado = inventarioAuto.buscarAutoYear(2023);
        autoYearEncontrado.forEach(n->System.out.println("Auto de la marca "+n.getMarca()+ " del año: " + n.getYear()+ " encontrado"));

        System.out.println("--------------");

        // Sumar el precio de los autos
        System.out.println("La suma del precio del inventario es: "+inventarioAuto.sumarInventario()+ " €.");

    }
}