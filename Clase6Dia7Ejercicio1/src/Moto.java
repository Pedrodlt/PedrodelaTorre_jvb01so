public class Moto extends Vehiculo implements Combustion{

    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int año, Double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Esta moto tiene carga por combustible.");
    }

    @Override
    public int calcularAntiguedad() {
        return 2023-getAño();
    }
}
