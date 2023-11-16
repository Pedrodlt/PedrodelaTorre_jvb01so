import java.util.ArrayList;
import java.util.List;

public class InventarioAutos <T extends Auto>{

    private List<T> autos;

    public InventarioAutos() {
        this.autos = new ArrayList<>();
    }

    //Método para agregar autos al inventario
    public void agregarAuto(T auto){
        autos.add(auto);
        System.out.println("Auto agregado al inventario: "+auto.getMarca()+" "+auto.getModelo());
    }

    //Método para buscar auto por marca, creamos una lista de autoMarca, recorremos con un forEach y agregamos la marca
    //encontrada a la lista, luego retornamos la lista
    public List<T> buscarAutoMarca(String marca){

        List<T> autoMarca = new ArrayList<>();
        autos.forEach(a->{
            if (a.getMarca().equalsIgnoreCase(marca)){
                autoMarca.add(a);
            }
        });
        return autoMarca;
    }

    //Método para buscar auto por año, creamos una lista de autoYear, recorremos con un forEach y agregamos el año
    //encontrado a la lista, luego retornamos la lista
    public List<T> buscarAutoYear(int year){

        List<T> autoYear = new ArrayList<>();
        autos.forEach(a->{
            if (a.getYear()==year){
                autoYear.add(a);
            }
        });
        return autoYear;
    }

    //Método para sumar el valor del inventario, en este caso recorremos la lista con un for, y sumamos en la variable
    //sumTotal el precio de cada uno de los autos, y devolvemos la suma
    public double sumarInventario(){
        
        double sumTotal = 0;
        for (T auto:autos) {
            sumTotal+=auto.getPrecio();
        }
        return sumTotal;
    }

    public List<T> getAutos() {
        return autos;
    }

    public void setAutos(List<T> autos) {
        this.autos = autos;
    }
}
