package miPrincipal;

public class BusquedaBinariaRecursiva {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // Array ordenado

        int target = 13; // Elemento a buscar

        int indice = buscar(array, target); // Llamada a la función de búsqueda binaria

        if (indice != -1) {
            System.out.println("El elemento " + target + " se encuentra en el índice: " + indice);
        } else {
            System.out.println("El elemento " + target + " no se encuentra en el array.");
        }
    }

    // Función de búsqueda binaria recursiva
    static int buscar(int[] array, int target) {
        return buscarRecursivo(array, target, 0, array.length - 1);
    }

    // Función auxiliar para la búsqueda binaria recursiva
    static int buscarRecursivo(int[] array, int target, int inicio, int fin) {
        if (inicio > fin) {
            return -1; // Elemento no encontrado
        }

        int medio = (inicio + fin) / 2;

        if (array[medio] == target) {
            return medio; // Elemento encontrado
        } else if (array[medio] < target) {
            return buscarRecursivo(array, target, medio + 1, fin); // Buscar en la mitad derecha del array
        } else {
            return buscarRecursivo(array, target, inicio, medio - 1); // Buscar en la mitad izquierda del array
        }
    }
}

