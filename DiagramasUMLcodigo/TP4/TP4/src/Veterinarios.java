import java.util.ArrayList;
import java.util.List;

public class Veterinarios {

    protected String nombre;
    protected int ID;
    protected List<Animales> AnimalesACargo;

    public Veterinarios(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
        this.AnimalesACargo = new ArrayList<>();
    }

    public void agregarAnimal(Animales animal) {
        if (AnimalesACargo.size() < 10) {
            AnimalesACargo.add(animal);
        } else {
            System.out.println(nombre + " ya tiene 10 animales a su cargo.");
        }
    }

    public void Mostrar() {
        System.out.println("\n Veterinario: " + nombre + " [ID: " + ID + "] - \nAnimales: ");
        for (Animales animal : AnimalesACargo) {
            animal.Mostrar();
        }
    }
}
