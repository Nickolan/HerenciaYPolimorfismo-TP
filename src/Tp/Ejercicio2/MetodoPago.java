package Tp.Ejercicio2;

public abstract class MetodoPago {
    String titular;
    int numero;

    public MetodoPago(String titular, int numero) {
    }

    public abstract void realizarPago();
}
