public class Mamifero extends Animal{

    private int numPatas;
    private String reproduccion;
    private String colorPelaje;
    private String habitat;

    public Mamifero(int id, String nombre, int edad, String piel, String alimentacion, int numPatas, String reproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, piel, alimentacion);
        this.numPatas = numPatas;
        this.reproduccion = reproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un mamífero");;
    }
}
