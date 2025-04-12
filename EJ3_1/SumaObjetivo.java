package EJ3_1;

import java.util.Arrays;
import java.util.HashSet;

public class SumaObjetivo {
    public static boolean existeSumaObjetivo(int[] numeros, int objetivo){
        HashSet<Integer> complementos = new HashSet<>();

        for(int num : numeros){
            int complemento = objetivo - num;
            if(complementos.contains(complemento)){
                return true;
            }
            complementos.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        testSumaObjetivo(new int[]{3, 5, 1, 7, 9}, 10);
        testSumaObjetivo(new int[]{2, 4, 6}, 11);
        testSumaObjetivo(new int[]{}, 5);
        testSumaObjetivo(new int[]{5}, 10);
        testSumaObjetivo(new int[]{5, 5}, 10);
    }

    private static void testSumaObjetivo(int[] arreglo, int objetivo) {
        System.out.println("\n--- Prueba ---");
        System.out.println("Arreglo: " + Arrays.toString(arreglo));
        System.out.println("Objetivo: " + objetivo);
        boolean resultado = existeSumaObjetivo(arreglo, objetivo);
        System.out.println("¿Existe suma que alcance el objetivo? " + 
                          (resultado ? "SÍ" : "NO"));
        
        if (resultado) {
            // Mostrar el par encontrado (solo con fines demostrativos)
            mostrarParEncontrado(arreglo, objetivo);
        }
    }

    private static void mostrarParEncontrado(int[] arreglo, int objetivo) {
        HashSet<Integer> complementos = new HashSet<>();
        for (int num : arreglo) {
            int complemento = objetivo - num;
            if (complementos.contains(complemento)) {
                System.out.println("Par encontrado: " + complemento + " + " + num + " = " + objetivo);
                return;
            }
            complementos.add(num);
        }
    }
}
