public class Reptil extends Animal{

    private Double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    public Reptil(int id, String nombre, int edad, String piel, String alimentacion, Double longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, piel, alimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un reptil.");
    }
}
