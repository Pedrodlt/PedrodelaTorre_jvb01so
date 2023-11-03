public class Zapato extends Vestimenta{

    private String material;
    private String tipoCierre;

    public Zapato(int codigo, String nombre, Double precio, String marca, Double talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    @Override
    public void mensaje() {
        System.out.println("Estos zapatos son de marca: "+getMarca());
    }
}
