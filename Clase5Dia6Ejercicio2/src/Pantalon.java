public class Pantalon extends Vestimenta{

    private String estilo;
    private String tipoTejido;

    public Pantalon(int codigo, String nombre, Double precio, String marca, Double talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    @Override
    public void mensaje() {
        System.out.println("Estos pantalones son de estilo: "+estilo);
    }
}
