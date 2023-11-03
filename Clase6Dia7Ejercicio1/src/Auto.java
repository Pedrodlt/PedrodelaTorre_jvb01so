public class Auto extends Vehiculo implements Electrico{

    private int capacidadBateria;
    private int autonomia;

    public Auto(int id, String placa, String marca, String modelo, int año, Double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Este auto tiene carga eléctrica.");
    }

    @Override
    public int calcularAntiguedad() {
        return 2023-getAño();
    }
}
