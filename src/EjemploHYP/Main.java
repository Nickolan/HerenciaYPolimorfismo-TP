package EjemploHYP;

public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Pepe", 20, 1001);
        Profesor p1 = new Profesor("Mario", 40, "Maistro");

        a1.mostrarDatos();
        a1.estudiar();
        p1.mostrarDatos();
        p1.estudiar();
    }




}
