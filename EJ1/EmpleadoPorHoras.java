/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

/**
 *
 * @author USUARIO
 */
public class EmpleadoPorHoras extends Empleado {  
    private int horasTrabajadas; //Atributos de un Empleado por horas
    private double pagoPorHora;
    
    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double pagoPorHora){
        super(nombre,0);
        this.horasTrabajadas = horasTrabajadas;    //Constructor donde se inicializa el salario Base a 0
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalarioFinal() {
        return this.horasTrabajadas * this.pagoPorHora; //Metodo para calcular el salario final de un empleado por horas
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: Por Horas");
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Pago por Hora: " + pagoPorHora);
        System.out.println("Salario Final: " + calcularSalarioFinal());
    }
}
