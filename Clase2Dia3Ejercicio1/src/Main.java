import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Buenos días, introduzca su edad: ");
        edad = scanner.nextInt();

        if(edad>=18){
            System.out.println("Enhorabuena, puede ingresar al recital.");
        }else{
            System.out.println("Lo sentimos, no tiene edad suficienta para ingresar al recital.");
        }
    }
}