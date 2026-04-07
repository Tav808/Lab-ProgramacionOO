import java.util.ArrayList;
import java.util.List;

public class Socios {

    protected String nombre;
    protected int NumeroSocio;
    protected List<Libros> librosCargo;

    public Socios(String nombre, int NumeroSocio) {
        this.nombre = nombre;
        this.NumeroSocio = NumeroSocio;
        this.librosCargo = new ArrayList<>();
    }

    public void agregarLibro(Libros libro) {
        if (librosCargo.size() < 5) {
            librosCargo.add(libro);
        } else {
            System.out.println(nombre + " ya tiene 5 libros a su cargo.");
        }
    }

    public void Mostrar() {
        System.out.println("Socio: " + nombre + " [ID: " + NumeroSocio + "] - \nLibros: ");
        for (Libros libro : librosCargo) {
            libro.Mostrar();
        }
    }
}
