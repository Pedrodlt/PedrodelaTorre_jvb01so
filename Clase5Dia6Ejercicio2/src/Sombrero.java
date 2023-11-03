public class Sombrero extends Vestimenta{

    private String tipo;
    private String tamaño;

    public Sombrero(int codigo, String nombre, Double precio, String marca, Double talla, String color, String tipo, String tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    @Override
    public void mensaje() {
        System.out.println("Este sombrero es de tipo: "+tipo);
    }
}
