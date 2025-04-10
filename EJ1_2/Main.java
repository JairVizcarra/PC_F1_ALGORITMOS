package EJ1_2;

public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Toyota", "Corolla", 2020, 45000.0, true);
        Motocicleta moto1 = new Motocicleta("Honda", "CBR600", 2021, 600);
        Automovil auto2 = new Automovil("Ford", "Ranger", 2019, 80000.0, false);

        System.out.println("----INFORMACIÓN DE VEHICULOS----");
        auto1.mostrarInformacion();
        System.out.println();
        moto1.mostrarInformacion();
        System.out.println();
        auto2.mostrarInformacion();

        System.out.println("\n----Comparación de Costos----");
        compararCostos(auto1, moto1);
        compararCostos(auto1, auto2);
        compararCostos(moto1, auto2);
    }

    public static void compararCostos(Vehiculo v1, Vehiculo v2){
        double costo1 = v1.calcularCostoMantenimiento();
        double costo2 = v2.calcularCostoMantenimiento();

        System.out.println("\nComparando");
        System.out.println(v1.getMarca() + " " + v1.getModelo() + " VS " + v2.getMarca() + " " + v2.getModelo());

        if(costo1 > costo2){
            System.out.println("El "+ v1.getMarca() + " "+ v1.getModelo()+ " tiene mayor costo de mantenimiento (+$" + (costo1-costo2)+")");
        } else if (costo2 > costo1) {
            System.out.println("El "+ v2.getMarca() + " "+ v2.getModelo()+ " tiene mayor costo de mantenimiento (+$" + (costo2-costo1)+")");
        }else{
            System.out.println("Ambos vehiculos tienen el mismo costo de mantenimiento");
        }

    }
    
}
