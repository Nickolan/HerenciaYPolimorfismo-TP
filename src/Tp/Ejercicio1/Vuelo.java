package Tp.Ejercicio1;

public abstract class Vuelo {
    int numeroVuelo;
    String origen;
    String destino;
    String fecha;

    public Vuelo(int numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public abstract int calcularPrecio();
}
