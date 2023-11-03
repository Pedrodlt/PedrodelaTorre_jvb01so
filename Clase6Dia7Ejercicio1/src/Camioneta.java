public class Camioneta extends Vehiculo implements Combustion{

    private int capacidadTanque;
    private Double consumocombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int año, Double costo, int capacidadTanque, Double consumocombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumocombustible = consumocombustible;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Esta camioneta tiene carga por combustible.");
    }

    @Override
    public int calcularAntiguedad() {
        return 2023-getAño();
    }
}
