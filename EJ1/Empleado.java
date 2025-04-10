/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

/**
 *
 * @author USUARIO
 */
public abstract class Empleado { //Clase Abastracta Empleado 
    protected String nombre;       //Atributos de la clase Empleado
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) { //Constructor para inicializar los atributos
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    public abstract double calcularSalarioFinal(); //Metodo abstracto que debe ser heredado por las clases hijas
    
    public void mostrarInformacion(){  //Mostrar información del Empleado
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Salario: "+this.salarioBase);
    }
}
