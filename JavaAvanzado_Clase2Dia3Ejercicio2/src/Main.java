public class Main {
    public static void main(String[] args) {

        Estacion estacion = new Estacion();

        int personas = 3;

        for (int i = 1; i <=personas ; i++) {
            Thread persona = new Thread(new Trabajador(estacion,"Trabajador "+i));
            persona.start();
        }

    }
}