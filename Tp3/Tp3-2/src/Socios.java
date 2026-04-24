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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSocio() {
        return NumeroSocio;
    }

    public void setNumeroSocio(int NumeroSocio) {
        this.NumeroSocio = NumeroSocio;
    }

    public List<Libros> getLibrosCargo() {
        return librosCargo;
    }

    public void setLibrosCargo(List<Libros> librosCargo) {
        this.librosCargo = librosCargo;
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
        for (int i = 0; i < librosCargo.size(); i++) {
            Libros libro = librosCargo.get(i);
            libro.Mostrar();
        }
    }
}
