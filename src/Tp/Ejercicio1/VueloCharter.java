package Tp.Ejercicio1;

public class VueloCharter extends Vuelo implements Promocionable{
    int precioTotal;

    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, int precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public int calcularPrecio() {
        return this.precioTotal;
    }

    @Override
    public void aplicarPromocion() {

    }
}
