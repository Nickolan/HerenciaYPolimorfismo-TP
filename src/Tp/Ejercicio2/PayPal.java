package Tp.Ejercicio2;

public class PayPal extends MetodoPago implements Cancelable {
    String correoElectronico;

    public PayPal(String titular, int numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con la cuenta paypal");
    }

    @Override
    public void cancelarPago(){

    }

}
