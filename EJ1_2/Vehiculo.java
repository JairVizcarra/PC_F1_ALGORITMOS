package EJ1_2;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAnio(){
        return this.anio;
    }

    public abstract double calcularCostoMantenimiento();

    public void mostrarInformacion(){
        System.out.println("Marca: "+getMarca() );
        System.out.println("Modelo: "+getMarca());
        System.out.println("Año: "+getAnio());
    }
    
}
