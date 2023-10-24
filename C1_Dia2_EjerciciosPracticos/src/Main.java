//Ejercicio Nº 1 - Sintaxis básica - Individual

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, Bienvenido al Sistema.");
        System.out.println("Introduce tu nombre:");

        nombre = scanner.nextLine();
        System.out.println("Hola "+nombre+", bienvenido al sistema.");

    }
}