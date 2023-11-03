public class Ave extends Animal{

    private Double tamañoAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave(int id, String nombre, int edad, String piel, String alimentacion, Double tamañoAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, piel, alimentacion);
        this.tamañoAlas = tamañoAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave.");
    }
}
