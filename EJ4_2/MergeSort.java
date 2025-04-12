package EJ4_2;

public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo");
        }
        if (array.length <= 1) {
            return; // Caso base: arreglo ya está ordenado
        }
        
        // arreglo auxiliar una sola vez para evitar múltiples creaciones
        int[] auxiliar = new int[array.length];
        mergeSort(array, auxiliar, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] auxiliar, int inicio, int fin) {
        if (inicio < fin) {
            int medio = inicio + (fin - inicio) / 2;
            
            // Ordenar primera mitad
            mergeSort(array, auxiliar, inicio, medio);
            
            // Ordenar segunda mitad
            mergeSort(array, auxiliar, medio + 1, fin);
            
            // Combinar las mitades ordenadas
            merge(array, auxiliar, inicio, medio, fin);
        }
    }

    private static void merge(int[] array, int[] auxiliar, int inicio, int medio, int fin) {
        // Copiar segmento a ordenar al arreglo auxiliar
        System.arraycopy(array, inicio, auxiliar, inicio, fin - inicio + 1);
        
        int i = inicio; // Índice para la primera mitad
        int j = medio + 1; // Índice para la segunda mitad
        int k = inicio; // Índice para el arreglo original

        // Combinar las dos mitades ordenadas
        while (i <= medio && j <= fin) {
            if (auxiliar[i] <= auxiliar[j]) {
                array[k++] = auxiliar[i++];
            } else {
                array[k++] = auxiliar[j++];
            }
        }

        // Copiar los elementos restantes de la primera mitad (si los hay)
        while (i <= medio) {
            array[k++] = auxiliar[i++];
        }
    }

    public static void main(String[] args) {
        testMergeSort(new int[]{38, 27, 43, 3, 9, 82, 10});
        testMergeSort(new int[]{5, 1, 4, 2, 8});
        testMergeSort(new int[]{100, 90, 80, 70, 60, 50});
        testMergeSort(new int[]{1});
        testMergeSort(new int[]{});
        testMergeSort(new int[]{2, 2, 2, 2, 2});
        testMergeSort(new int[]{-5, -1, -3, 0, 4, 2});
    }

    private static void testMergeSort(int[] array) {
        System.out.println("\n--- Prueba de Merge Sort ---");
        System.out.println("Arreglo original: " + arrayToString(array));
        
        try {
            mergeSort(array);
            System.out.println("Arreglo ordenado: " + arrayToString(array));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String arrayToString(int[] array) {
        if (array == null) return "null";
        if (array.length == 0) return "[]";
        
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
}
