public class LlamadasTelefonicas {

    public synchronized void contestarLlamada(String nombre){
        System.out.println("El agente está contestando una llamada "+nombre);

    }
    public synchronized void resolverConsultas(String nombre){
        System.out.println("El agente está resolviendo la consulta "+nombre);
    }
    public synchronized void registrarInformación(String nombre){
        System.out.println("El agente está registrando la información "+nombre);
    }
}
