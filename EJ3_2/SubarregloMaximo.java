package EJ3_2;

public class SubarregloMaximo {
    public static int maxSubarraySum(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }

        int maximaSumaActual = numeros[0];
        int maximaSumaGlobal = numeros[0];

        // Comenzamos desde el segundo elemento ya que el primero ya fue considerado
        for (int i = 1; i < numeros.length; i++) {
            /* La máxima suma hasta el índice actual es:
             * - El número actual (empezando un nuevo subarreglo), o
             * - El número actual + la máxima suma hasta el índice anterior (extendiendo el subarreglo actual)
             */
            maximaSumaActual = Math.max(numeros[i], maximaSumaActual + numeros[i]);
            
            // Actualizamos la máxima suma global si encontramos una nueva máxima
            maximaSumaGlobal = Math.max(maximaSumaGlobal, maximaSumaActual);
        }

        return maximaSumaGlobal;
    }

    public static void main(String[] args) {
        testSubarregloMaximo(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        testSubarregloMaximo(new int[]{1, 2, 3, -2, 5});
        testSubarregloMaximo(new int[]{-1, -2, -3, -4});
        testSubarregloMaximo(new int[]{5, -4, 3, -2, 1});
        testSubarregloMaximo(new int[]{2, 3, -5, 4, 8, -11, 6});
    }

    private static void testSubarregloMaximo(int[] arreglo) {
        System.out.println("\n--- Prueba ---");
        System.out.println("Arreglo: " + java.util.Arrays.toString(arreglo));
        try {
            int resultado = maxSubarraySum(arreglo);
            System.out.println("Suma máxima de subarreglo contiguo: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
}
