public class Gatos extends Animales {

    public Gatos(String nombre, int edad) {
        super(nombre, edad);
    }

    public void Maullar() {
        System.out.println("Miau miau");
    }

    public void Mostrar() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }
}
