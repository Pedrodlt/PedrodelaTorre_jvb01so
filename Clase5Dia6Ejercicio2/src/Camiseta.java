public class Camiseta extends Vestimenta{

    private String manga;
    private String cuello;

    public Camiseta(int codigo, String nombre, Double precio, String marca, Double talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    @Override
    public void mensaje() {
        System.out.println("Esta camiseta es de manga: "+manga);
    }
}
