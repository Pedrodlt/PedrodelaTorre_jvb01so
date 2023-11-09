public class Main {
    public static void main(String[] args) {

        LlamadasTelefonicas llamada = new LlamadasTelefonicas();

        int agentes = 3;

        for (int i = 1; i <=agentes ; i++) {
            Thread agente = new Thread(new Agente(llamada,"Agente "+i));
            agente.start();
        }
    }
}