import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String array [][] = new String[5][5];
        Scanner scanner = new Scanner(System.in);

        for (int f=0; f<5;f++){
            for(int a=0; a<5;a++){
                System.out.println("Introduce la fila: "+f+ " y el asiento: "+a);
                array[f][a] = scanner.nextLine();
            }
        }

        for (int f=0; f<5;f++){
            for(int a=0; a<5;a++){
                System.out.println(array[f][a]+ " ");
            }
        }
    }
}