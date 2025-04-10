package EJ1;

public class Principal {
    public static void main(String[] args){
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Jose Ramirez", 2500.0, 500.0);
        
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Maria", 160, 15.75);

        System.out.println("------INFORMACIÓN DE EMPLEADOS------");
        empleado1.mostrarInformacion();
        System.out.println();
        empleado2.mostrarInformacion();
        
    }
    
}
