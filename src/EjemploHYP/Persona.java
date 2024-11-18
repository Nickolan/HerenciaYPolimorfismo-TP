package EjemploHYP;

public abstract class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años");
    }

    public void comer(){
        System.out.println("Comiendo...");
    }

    public abstract void estudiar();
}
