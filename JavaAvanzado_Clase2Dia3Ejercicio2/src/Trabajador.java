public class Trabajador implements Runnable{

    private Estacion estacion;
    private String nombre;

    public Trabajador(Estacion estacion, String nombre) {
        this.estacion = estacion;
        this.nombre = nombre;
    }

    @Override
    public void run() {

        estacion.ensamblar(nombre);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        estacion.controlar(nombre);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        estacion.embalar(nombre);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
