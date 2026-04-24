public class Perros extends Animales {

    public Perros(String nombre, int edad) {
        super(nombre, edad);
    }

    public void Ladrar() {
        System.out.println("Guau guau");
    }

    public void Mostrar() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }
}
