package miPrincipal; // Declaración del paquete donde se encuentra la clase

public class alfabeto { // Declaración de la clase "alfabeto"
    public static void main(String[] args) { // Método principal
        System.out.println(" "); // Imprime una línea en blanco
        methodA('Z'); // Llama al método methodA con el carácter 'Z'
        System.out.println(" "); // Imprime una línea en blanco
    }

    static void methodA(char c) { // Definición del método methodA que toma un carácter como parámetro
        System.out.print(c); // Imprime el carácter actual
        if (c != 'A') { // Verifica si el carácter es diferente de 'A'
            methodB(--c); // Llama al método methodB con el carácter anterior
        }
    }

    static void methodB(char c) { // Definición del método methodB que toma un carácter como parámetro
        System.out.print(c); // Imprime el carácter actual
        if (c != 'A') { // Verifica si el carácter es diferente de 'A'
            methodA(--c); // Llama al método methodA con el carácter anterior
        }
    }
}
