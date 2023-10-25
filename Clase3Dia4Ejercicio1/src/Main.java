public class Main {
    public static void main(String[] args) {

        Electrodomestico electrodomestico1 = new Electrodomestico(1,"Bosch","SoundSistem",50,"Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(2,"Fagor","Easy",100,"Negro");
        Electrodomestico electrodomestico3 = new Electrodomestico(1,"Balay","StrongPlus",200,"Rojo");

        Electrodomestico electrodomestico4 = new Electrodomestico();

        System.out.println("La marca es: "+electrodomestico1.getMarca()+ " el modelo es: "+electrodomestico1.getModelo()+ " y el consumo es: "+electrodomestico1.getConsumo()+"kW.");
        System.out.println("La marca es: "+electrodomestico2.getMarca()+ " el modelo es: "+electrodomestico2.getModelo()+ " y el consumo es: "+electrodomestico2.getConsumo()+"kW.");
        System.out.println("La marca es: "+electrodomestico3.getMarca()+ " el modelo es: "+electrodomestico3.getModelo()+ " y el consumo es: "+electrodomestico3.getConsumo()+"kW.");

        System.out.println("La marca del electrodoméstico 4 es: "+electrodomestico4.getMarca());

        // El electrodomestico 4 aparece como null al no estar declarado, podríamos setearle la marca para que tuviera valor.




    }
}