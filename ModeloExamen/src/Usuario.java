import java.util.List;

public class Usuario {

    private String nombre;
    private List<ContenidoMultimedia> listaFavoritos;

    public Usuario(String nombre, List<ContenidoMultimedia> listaFavoritos) {
        this.nombre = nombre;
        this.listaFavoritos = listaFavoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ContenidoMultimedia> getListaFavoritos() {
        return listaFavoritos;
    }

    public void setListaFavoritos(List<ContenidoMultimedia> listaFavoritos) {
        this.listaFavoritos = listaFavoritos;
    }

    public void agregarAFavoritos(ContenidoMultimedia contenido) {
        this.listaFavoritos.add(contenido);
    }
}
