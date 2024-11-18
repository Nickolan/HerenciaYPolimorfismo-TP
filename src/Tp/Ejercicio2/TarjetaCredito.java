package Tp.Ejercicio2;

public class TarjetaCredito extends MetodoPago implements Cancelable {
    String fechaExpiracion;
    int codigoSeguridad;

    public TarjetaCredito(String titular, int numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con la tarjeta");
    }

    @Override
    public void cancelarPago(){
        System.out.println("Cancelando pago...");
        System.out.println("Pago cancelado");
    }

}
