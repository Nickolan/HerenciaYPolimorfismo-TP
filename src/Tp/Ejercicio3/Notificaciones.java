package Tp.Ejercicio3;

import java.util.ArrayList;

public class Notificaciones {

    ArrayList<CanalNotificacion> canales;

    public Notificaciones() {
        this.canales = new ArrayList<>();
    }

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
    }

    public void parsonalizarMensajes(String mensajePersonalizado){
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable){
                ((Personalizable) canal).personalizarMensaje(mensajePersonalizado);
            }
        }
    }

    public void mostrarCanales(){
        for (CanalNotificacion canal: canales ) {
            System.out.println("Usuario: " + canal.usuario +", Mensaje: " + canal.mensaje);
        }
    }

}
