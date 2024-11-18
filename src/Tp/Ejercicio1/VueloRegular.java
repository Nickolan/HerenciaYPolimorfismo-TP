package Tp.Ejercicio1;

public class VueloRegular extends Vuelo implements Promocionable {
    int numeroAsientos;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public int calcularPrecio() {
        int precioBase = 10;
        return precioBase * this.numeroAsientos;
    }

    @Override
    public void aplicarPromocion() {

    }
}
