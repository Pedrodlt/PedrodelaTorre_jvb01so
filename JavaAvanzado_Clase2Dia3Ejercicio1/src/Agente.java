
public class Agente implements Runnable{

    private LlamadasTelefonicas llamada;
    private String nombre;

    public Agente(LlamadasTelefonicas llamada, String nombre) {
        this.llamada = llamada;
        this.nombre = nombre;
    }

    @Override
    public void run() {

        llamada.contestarLlamada(nombre);


        llamada.registrarInformación(nombre);


        llamada.resolverConsultas(nombre);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
