package EJ1_2;

public class Automovil extends Vehiculo{
    private double kilometraje;
    private boolean tieneAireAcondicionado;

    public Automovil (String marca, String modelo, int anio, double kilometraje, boolean tieneAireAcondicionado){
        super(marca, modelo, anio);
        this.kilometraje = kilometraje;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    
    @Override
    public double calcularCostoMantenimiento(){
        double costoBase = 100.0 + (kilometraje * 0.05);
        if(tieneAireAcondicionado){
            costoBase += 200.0;
        }
        return costoBase;

    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tipo: Automovil");
        System.out.println("Kilometraje: "+ kilometraje);
        System.out.println("Aire Acondicionado: "+ (tieneAireAcondicionado ? "Si" : "No"));
        System.out.println("Costo Mantenimiento: "+ calcularCostoMantenimiento());
    }

}
