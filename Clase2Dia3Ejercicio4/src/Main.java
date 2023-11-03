import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("- - - Bienvenido al sistema de anfiteatros - - -");
        char asientos [][] = new char[5][5];
        int fila, asiento, option;
        boolean bandera = false;
        Scanner teclado = new Scanner (System.in);

        System.out.println("Cargando asientos...");

        for (int f = 0; f < asientos.length; f++) {
            for(int c=0; c < asientos[0].length;c++){
                asientos[f][c]='O';
            }
        }

        while(bandera!=true){
            System.out.println("Ingrese la fila.Valor entre 0 y 4");
            fila = teclado.nextInt();

            System.out.println("Ingrese el asiento. Valor entre 0 y 4");
            asiento = teclado.nextInt();

            if(fila>=0 && fila<=4){//Controlador para no pasarte de fila

                if (asiento >= 0 && asiento <= 4) {
                    //con String se haría: asientos[fila][asiento].equals("O")
                    if(asientos[fila][asiento]=='O'){
                        asientos[fila][asiento]='X';
                        System.out.println("Asiento asignado correctamente");
                    }else{
                        System.out.println("Asiento ocupado, por favor elija otro");
                    }
                }else{
                    System.out.println("El asiento ingresado no es válido. Ingrese un valor entre 0 y 4");
                }
            }else{
                System.out.println("La fila ingresada no es válida. Ingrese un valor entre 0 y 4");
            }
            System.out.println("Desea continuar? Ingrese 1 para continuar u otro número para salir.");
            option = teclado.nextInt();

            if(option!=1){
                bandera=true;
            }else{
                System.out.println("");
            }
        }
    }
}