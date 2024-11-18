package Tp.Ejercicio3;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones nuevasNotificaciones = new Notificaciones();
        CorreoElectronico mc1 = new CorreoElectronico("Pepito Grillo", "Hola mario, como estas?", "marito@gmail.com");
        MensajeTexto mt1 = new MensajeTexto("Jose antonio", "Hola jose", "2616090889");

        nuevasNotificaciones.agregarCanal(mc1);
        nuevasNotificaciones.agregarCanal(mt1);

        nuevasNotificaciones.mostrarCanales();
        nuevasNotificaciones.enviarNotificaciones();
        nuevasNotificaciones.parsonalizarMensajes("Modificando el mensaje");
        nuevasNotificaciones.enviarNotificaciones();
        nuevasNotificaciones.mostrarCanales();
    }
}
