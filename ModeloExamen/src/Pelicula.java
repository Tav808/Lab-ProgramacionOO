public class Pelicula extends ContenidoMultimedia {

    private int duracion;

    public Pelicula(int id, String titulo, int duracion) {
        super(id, titulo);
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo pelicula:" + titulo + " duracion: " + duracion);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
