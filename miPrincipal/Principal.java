package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opc = 0;
        
        do {
            System.out.println("************************");
            System.out.println("      RECURSIVIDAD      ");
            System.out.println("************************");
            System.out.println("1) LADRILLOS            ");
            System.out.println("2) FACTORIAL            ");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc = consola.nextInt();

            switch (opc) {
                case 1:
                    AppLadrillos.menu();
                    break;
                case 2:
                    AppFactorial.menu();
                    break;
                case 0:
                    System.out.println("ADIOS!");
                    break;
                default:
                    System.out.println("Valor incorrecto, intente de nuevo!");
                    break;
            }
        } while (opc != 0);
        
        consola.close();
    }
}
