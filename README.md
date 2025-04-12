PRÁCTICA CALIFICADA FASE I
Ejercicio 1.1: Gestión de Empleados
Enunciado:
Crea una jerarquía de clases para gestionar empleados en una empresa.
• Clase abstracta Empleado:
 Atributos: nombre (String) y salarioBase (double).
 Método abstracto: public double calcularSalarioFinal().
• Subclases:
 EmpleadoTiempoCompleto: Recibe un bono extra (double) y el salario final
es la suma del salario base y el bono.
 EmpleadoPorHoras: Tiene atributos horasTrabajadas (int) y pagoPorHora
(double); su salario final es el producto de ambos.
• Requisitos adicionales:
 Implementa un método mostrarInformacion() en cada clase que imprima el
nombre y el salario final.
 Documenta brevemente las decisiones de diseño en comentarios

Ejercicio 1.2: Sistema de Vehículos
Enunciado:
Diseña una jerarquía para modelar vehículos.
• Clase abstracta Vehiculo:
 Atributos: marca (String), modelo (String) y anio (int).
 Método abstracto: public double calcularCostoMantenimiento().
• Subclases:
 Automovil: Tiene un atributo adicional kilometraje (double) y un indicador
tieneAireAcondicionado (boolean). El costo de mantenimiento puede
depender del kilometraje y de si posee aire acondicionado.
 Motocicleta: Incorpora el atributo cilindrada (int). El costo se calcula en
base a la cilindrada.
• Requisitos adicionales:
 Implementa constructores, getters y setters necesarios.
 Añade un método en la clase principal que permita comparar dos
vehículos según su costo de mantenimiento

Ejercicio 2.1: Contenedor Genérico
Enunciado:
Implementa una clase genérica Contenedor<T> que gestione una colección interna de
elementos.
• Métodos a implementar:
 public void agregar(T elemento): Agrega un elemento.
 public T obtener(int indice): Devuelve el elemento en la posición indicada.
 public int contar(): Retorna la cantidad de elementos.
 public boolean estaVacio(): Indica si el contenedor está vacío.
• Implementación:
 Utiliza un ArrayList<T> internamente.
• Prueba:
 Crea dos instancias: una para almacenar objetos String y otra para
almacenar objetos de tipo Producto (o alguna clase del ejercicio 1).

Ejercicio 2.2: Clase Genérica Par
Enunciado:
Crea una clase genérica Par<A, B> que almacene dos objetos de tipos potencialmente
distintos.
• Requisitos:
 Implementa constructores, getters y setters para ambos atributos.
 Sobrescribe el método toString() para representar el par en formato "(A, B)".
• Prueba:
 Crea varios objetos Par con combinaciones de tipos (por ejemplo,
Par<String, Integer> y Par<Empleado, String>).

Ejercicio 3.1: Suma Objetivo en un Arreglo
Enunciado:
Desarrolla un método que, dado un arreglo de enteros y un valor objetivo, determine si
existe algún par de números cuya suma sea igual al valor objetivo.
public boolean existeSumaObjetivo(int[] numeros, int objetivo)
• Requisitos:
 Implementa una solución utilizando un HashSet para obtener una
complejidad promedio O(n). 
 Añade comentarios explicando la complejidad temporal y espacial.
• Prueba:
 Ejemplo 1: [3, 5, 1, 7, 9] con objetivo 10 → debe retornar true.
 Ejemplo 2: [2, 4, 6] con objetivo 11 → debe retornar false.

Ejercicio 3.2: Subarreglo con Suma Máxima (Problema de Kadane)
Enunciado:
Implementa un método que encuentre la suma máxima de un subarreglo contiguo dentro
de un arreglo de enteros.
public int maxSubarraySum(int[] numeros)
• Requisitos:
 Utiliza el algoritmo de Kadane para lograr una solución con complejidad
O(n).
 Comenta el proceso y explica por qué esta solución es eficiente.
• Prueba:
 Ejemplo: Para el arreglo [−2, 1, −3, 4, −1, 2, 1, −5, 4], el resultado debe ser
6.

Ejercicio 4.1: Fibonacci con Recursión y Memorización
Enunciado:
Implementa un método para calcular el n-ésimo número de la sucesión de Fibonacci
utilizando recursión. Luego, mejora la solución implementando memorización.
public int fibonacci(int n)
• Requisitos:
 Valida que n sea mayor o igual a 0; en caso contrario, lanza una excepción
(IllegalArgumentException).
 Primero, implementa la versión recursiva simple y comenta su ineficiencia
para valores altos.
 Después, añade una versión con memorización utilizando un Map<Integer,
Integer>.
 Explica la diferencia en complejidad entre ambas versiones (exponencial
vs. lineal).

Ejercicio 4.2: Merge Sort
Enunciado:
Desarrolla una implementación recursiva del algoritmo Merge Sort para ordenar un
arreglo de enteros.
public void mergeSort(int[] array)
• Requisitos:
 Divide el arreglo en mitades, ordena cada mitad recursivamente y luego
fusiona las mitades ordenadas.
 Documenta en comentarios la complejidad temporal (O(n log n)) y
espacial.
 Maneja correctamente el caso base y valida las entradas.
• Prueba:
 Proporciona ejemplos que demuestren el correcto funcionamiento del
algoritmo.
