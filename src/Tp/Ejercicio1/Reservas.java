package Tp.Ejercicio1;

import java.util.ArrayList;

public class Reservas {
    ArrayList<Vuelo> vuelos = new ArrayList<>();

    public void agregarVuelos(Vuelo v){
        this.vuelos.add(v);
    }

    public void calcularTotalReservas(){
        int total = 0;
        for (Vuelo vuelo: vuelos) {
            total += 1;
        }

        System.out.println("El total de reservas es de " +total);
    }

    public void aplicarPromociones(){
        System.out.println("No se que es esto");
    }

}
