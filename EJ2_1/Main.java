package EJ2_1;

public class Main {
    public static void main(String[] args) {
        //Prueba contenedor con tipo dato String
        Contenedor<String> contenedorString = new Contenedor<>();

        System.out.println("---PRUEBA CON STRING---");
        contenedorString.agregar("Hola");
        contenedorString.agregar("Mundo");
        contenedorString.agregar("Algoritmos");

        System.out.println("¿Está vacío? " + contenedorString.estaVacio());
        System.out.println("Cantidad de elementos: " + contenedorString.contar());

        System.out.println("Elemento en posición 1: " + contenedorString.obtener(1));
        contenedorString.mostrarElementos();
        //Pruba contenedor con tipo objeto Producto
        Contenedor<Producto> contenedorProductos = new Contenedor<>();
        System.out.println("---PRUEBA CON Productos---");
        contenedorProductos.agregar(new Producto("Laptop", 1200.99));
        contenedorProductos.agregar(new Producto("Teléfono", 599.50));
        contenedorProductos.agregar(new Producto("Tablet", 350.75));

        System.out.println("Cantidad de productos: " + contenedorProductos.contar());
        System.out.println("Primer producto: " + contenedorProductos.obtener(0));
        contenedorProductos.mostrarElementos();

    }
    
}
