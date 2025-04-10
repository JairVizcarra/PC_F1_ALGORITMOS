/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

/**
 *
 * @author USUARIO
 */
public class EmpleadoTiempoCompleto extends Empleado{
    private double bonoExtra;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bonoExtra) {
        super(nombre, salarioBase);
        this.bonoExtra = bonoExtra;  //Constructor donde hereda el atributo nombre de la clase Padre
    }
    
    
    @Override
    public double calcularSalarioFinal(){
        return salarioBase + this.bonoExtra;  //Metodo para calcular el salario Final de un empleado de tiempo completo
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Tiempo Completo");
        System.out.println("Bono Extra: " + bonoExtra);
    }
}
