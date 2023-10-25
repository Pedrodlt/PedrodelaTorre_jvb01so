import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double productPrice;
        double sumaPrice = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido, introduzca el precio del producto: ");
        productPrice = scanner.nextDouble();

        while (productPrice>0){
            sumaPrice+=productPrice;
            System.out.println("Introduzca el precio del siguiente producto o pulsa 0 para finalizar: ");
            productPrice = scanner.nextDouble();
        }

        System.out.println("El precio total de la compra es: "+ sumaPrice);

    }
}