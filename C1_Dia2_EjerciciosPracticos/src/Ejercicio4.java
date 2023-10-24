import java.util.Scanner;

//Ejercicio Nº 4 - Operaciones de Lectura - Grupal
public class Ejercicio4 {
    public static void main(String[] args) {

        int num1, num2, sum, res, multi;
        double div;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número entero: ");
        num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número entero: ");
        num2 = scanner.nextInt();

        sum = num1+num2;
        System.out.println("La suma de los dos números es: "+sum);

        res = num1-num2;
        System.out.println("La resta de los dos números es: "+res);

        multi = num1*num2;
        System.out.println("La multiplicación de los dos números es: "+multi);

        div = (double) num1 /num2;
        System.out.println("La división de los dos números es: "+div);

    }
}
