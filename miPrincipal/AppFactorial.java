package miPrincipal;

import java.util.Scanner;

public class AppFactorial {
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor para calcular el factorial: ");
        int f = scanner.nextInt();
        
        try {
            long factorial = calcularFactorial(f);
            System.out.println("El factorial de " + f + " es: " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static long calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo.");
        }
        
        long factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
