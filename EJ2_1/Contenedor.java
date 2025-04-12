package EJ2_1;

import java.util.ArrayList;

public class Contenedor<T> {
    private ArrayList<T> elementos;

    public Contenedor(){
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento){
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
        return elementos.get(indice);
    }

    public int contar(){
        return elementos.size();
    }

    public boolean estaVacio(){
        return elementos.isEmpty();
    }

    public void mostrarElementos() {
        if (estaVacio()) {
            System.out.println("El contenedor está vacío");
            return;
        }
        
        System.out.println("Contenido del contenedor (" + elementos.size() + " elementos):");
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println((i + 1) + ". " + elementos.get(i).toString());
        }
    }
    
}
