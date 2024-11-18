package Tp.Ejercicio2;

import java.util.ArrayList;

public class Pagos {
    ArrayList<MetodoPago> metodosPagos = new ArrayList<>();

    public void agregarMetodo(MetodoPago nuevoMP){
        System.out.println("Agregando nuevo metodo de pago");
        metodosPagos.add(nuevoMP);
    }

    public void realizarPagos(){
        for (MetodoPago mp: metodosPagos ) {
            mp.realizarPago();
        }
    }

    public void cancelarPagos(){
        for (MetodoPago mp: metodosPagos ) {

        }
    }

    public void mostrarPagos(){
        for (MetodoPago mp: metodosPagos ) {
            System.out.println("Titular: " + mp.titular + "; Numero: "+mp.numero);
        }
    }


}
