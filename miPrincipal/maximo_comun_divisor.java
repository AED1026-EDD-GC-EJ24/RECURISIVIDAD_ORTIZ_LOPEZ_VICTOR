package miPrincipal;
import java.util.Scanner;
public class maximo_comun_divisor {    // Declaración de la clase MaximoComunDivisor
        public static void main(String[] args) { // Método principal
            Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para la entrada de usuario
    
            System.out.print("Ingrese el primer número: "); // Solicita al usuario que ingrese el primer número
            int numero1 = scanner.nextInt(); // Lee el primer número ingresado por el usuario
    
            System.out.print("Ingrese el segundo número: "); // Solicita al usuario que ingrese el segundo número
            int numero2 = scanner.nextInt(); // Lee el segundo número ingresado por el usuario
    
            int mcd = calcularMCD(numero1, numero2); // Llama al método calcularMCD para obtener el MCD de los dos números
    
            System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd); // Imprime el resultado
        }
    
        // Método para calcular el máximo común divisor (MCD) utilizando el algoritmo de Euclides
        static int calcularMCD(int a, int b) {
            while (b != 0) { // Mientras el segundo número no sea cero
                int temp = b; // Guarda el valor de b en una variable temporal
                b = a % b; // Calcula el resto de dividir a entre b y lo asigna a b
                a = temp; // Asigna el valor de b (guardado previamente en temp) a a
            }
            return a; // Devuelve el valor de a, que es el MCD
        }
    }

