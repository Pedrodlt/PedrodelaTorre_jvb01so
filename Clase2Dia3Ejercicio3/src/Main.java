import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tempMax,promedio;
        double sumaTemp = 0;
        int count = 0;
        int[] temperatura = new int[7];

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<temperatura.length; i++){
            //Pedimos al usuario que introduzca la temperatura máxima
            System.out.println("Introduce la temperatura máxima: ");
            tempMax = scanner.nextDouble();
            //Añadimos en cada vuelta la temperatura máxima al vector
            temperatura[i]+=tempMax;
            //Sumamos en cada vuelta la tempertarua máxima introducida
            sumaTemp+=temperatura[i];
            //Aumentamos el contador para poder obtener el promedio más adelante
            count++;

        }
        promedio = sumaTemp/count;

        System.out.println("El promedio de las temperaturas máximas es: "+promedio);

    }
}