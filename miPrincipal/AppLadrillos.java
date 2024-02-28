package miPrincipal;

import java.util.Scanner;

public class AppLadrillos {
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor inicial de la pila: ");
        int valorInicial = scanner.nextInt();
        
        if (valorInicial < 100) {
            dibujarPared(valorInicial);
        } else {
            System.out.println("El valor inicial de la pila ya es igual o mayor que 100.");
        }
    }
    
    public static void dibujarPared(int valorActual) {
        if (valorActual < 100) {
            dibujarHilera();
            dibujarPared(valorActual + 1); // Llamada recursiva con tamaño incrementado
        } else {
            System.out.println("La pila ha alcanzado el tamaño máximo (100).");
        }
    }
    
    public static void dibujarHilera() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
}
