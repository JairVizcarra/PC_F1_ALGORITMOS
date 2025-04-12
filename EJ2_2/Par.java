package EJ2_2;

import EJ1.Empleado;
import EJ1.EmpleadoTiempoCompleto;

public class Par<A,B> {
    private A primero;
    private B segundo;
    
    public Par(A primero, B segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public A getPrimero() {
        return primero;
    }

    public void setPrimero(A primero) {
        this.primero = primero;
    }

    public B getSegundo() {
        return segundo;
    }

    public void setSegundo(B segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "[" + primero + "," + segundo + "]";
    }

    public static void main(String[] args){
        //Par con String y Integer
        Par<String, Integer> parNombreEdad = new Par<>("Rodrigo", 23);
        System.out.println("Par Nombre - Edad: "+parNombreEdad);
        parNombreEdad.setSegundo(26);  //Actualizar la edad
        System.out.println("Par Nombre-Edad actualizado: " + parNombreEdad);
        //Par con Empleado y String
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Christian Alvarez", 3000.0, 500.0);
        Par<Empleado, String> parEmpleadoPuesto = new Par<>(empleado, "Ingeniero de Sistemas");
        parEmpleadoPuesto.primero.mostrarInformacion();
        System.out.println("\nPar Empleado-Puesto: " + parEmpleadoPuesto.segundo);
        //Par con Double y Boolean
        Par<Double, Boolean> parPrecioDisponible = new Par<>(199.99, true);
        System.out.println("\nPar Precio-Disponible: " + parPrecioDisponible);
        parPrecioDisponible.setPrimero(179.99);
        parPrecioDisponible.setSegundo(false);
        System.out.println("Par Precio-Disponible modificado: " + parPrecioDisponible);
        
    }

    
}
