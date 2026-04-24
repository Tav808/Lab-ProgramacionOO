public class Animales {

    protected String nombre;
    protected int edad;

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Mostrar() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }
}
