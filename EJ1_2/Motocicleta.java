package EJ1_2;

public class Motocicleta extends Vehiculo{
    private int cilindrada;

    public Motocicleta(String modelo, String marca, int anio, int cilindrada){
        super(modelo, marca, anio);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCostoMantenimiento() {
        return 50.0 + (cilindrada * 0.1);
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tipo: Motocicleta");
        System.out.println("Cilindrada: "+ cilindrada);
        System.out.println("Costo Mantenimiento: "+ calcularCostoMantenimiento());
    }
    
}
