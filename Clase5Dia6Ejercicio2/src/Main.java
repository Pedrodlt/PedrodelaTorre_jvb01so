public class Main {
    public static void main(String[] args) {

        //Creación del vector Vestimenta

        Vestimenta[] vestimentas = new Vestimenta[9];

        vestimentas[0] = new Zapato(1,"Zapatilla",130.0,"Nike",43.5,"Blanco","Tela","Cordones");
        vestimentas[1] = new Zapato(2,"Zapato",150.0,"Timberland",40.5,"Negro","Cuero","Cremallera");
        vestimentas[2] = new Zapato(3,"Chancla",30.0,"Quicksilver",41.0,"Verde","Plástico","Sin cierre");
        vestimentas[3] = new Pantalon(4,"Vaquero",70.0,"H&M",42.0,"Azul","skiny","Vaquero");
        vestimentas[4] = new Pantalon(5,"Pantalon de pana",150.0,"Springfield",45.0,"Negro","Regular","Pana");
        vestimentas[5] = new Pantalon(6,"Chandal",40.0,"Pull&Bear",39.0,"Gris","Fit","Tela");
        vestimentas[6] = new Camiseta(7,"Camiseta manga corta",40.0,"Billabong",40.0,"Negro","Corta","Redondo");
        vestimentas[7] = new Camiseta(8,"Camiseta manga larga",35.0,"DC",43.0,"Morado","Larga","Pico");
        vestimentas[8] = new Sombrero(9,"Sombrero de copa",50.90,"Pull and Bear",36.0,"Negro","Copa","M");

        //Recorremos el vector y monstramos el mensaje
        for (Vestimenta vestimenta:vestimentas) {
            vestimenta.mensaje();
        }
    }
}