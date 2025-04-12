package EJ4_1;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    //Complejidad: O(2^n)
    public static int fibonacciRecursivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo");
        }
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    private static Map<Integer, Integer> cache = new HashMap<>();
    //Complejidad: O(n)
    public static int fibonacciMemo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo");
        }
        return fibonacciMemoHelper(n);
    }

    private static int fibonacciMemoHelper(int n) {
        if (n <= 1) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int resultado = fibonacciMemoHelper(n - 1) + fibonacciMemoHelper(n - 2);
        cache.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        testFibonacci(0);
        testFibonacci(1);
        testFibonacci(5);
        testFibonacci(10);
        testFibonacci(20);
        testFibonacci(40); //memorización
    }
    
    private static void testFibonacci(int n) {
        System.out.println("\n--- Cálculo de Fibonacci(" + n + ") ---");
        
        // Versión con memorización (eficiente)
        long inicioMemo = System.nanoTime();
        int resultadoMemo = fibonacciMemo(n);
        long tiempoMemo = System.nanoTime() - inicioMemo;
        System.out.println("Con memorización: " + resultadoMemo + 
                         " (Tiempo: " + tiempoMemo + " ns)");
        
        // Versión recursiva simple (solo para n pequeños)
        if (n <= 30) { // Para n mayores es demasiado lento
            long inicioRec = System.nanoTime();
            int resultadoRec = fibonacciRecursivo(n);
            long tiempoRec = System.nanoTime() - inicioRec;
            System.out.println("Recursivo simple: " + resultadoRec + 
                             " (Tiempo: " + tiempoRec + " ns)");
            System.out.println("Mejora de velocidad: ~" + (tiempoRec/tiempoMemo) + "x más rápido");
        } else {
            System.out.println("Recursivo simple: No probado para n > 30 (demasiado lento)");
        }
        
        // Limpiar cache
        cache.clear();
    }
}
