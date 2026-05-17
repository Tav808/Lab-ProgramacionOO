import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("Juan Pérez", new ArrayList<>());

        ContenidoMultimedia peli1 = new Pelicula(1, "El Padrino", 175);
        ContenidoMultimedia peli2 = new Pelicula(2, "Matrix", 136);
        ContenidoMultimedia serie1 = new Serie(3, "The Boys", 4);

        usuario.agregarAFavoritos(peli1);
        usuario.agregarAFavoritos(peli2);
        usuario.agregarAFavoritos(serie1);

        System.out.println("Reproduciendo favoritos de: " + usuario.getNombre());
        for (ContenidoMultimedia contenido : usuario.getListaFavoritos()) {
            contenido.reproducir();
        }
    }
}
