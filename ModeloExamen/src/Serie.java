public class Serie extends ContenidoMultimedia {

    private int cantidadTemporadas;

    public Serie(int id, String titulo, int cantidadTemporadas) {
        super(id, titulo);
        this.cantidadTemporadas = cantidadTemporadas;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo serie: " + titulo + " temporada: " + cantidadTemporadas);
    }

    public int getCantidadTemporadas() {
        return cantidadTemporadas;
    }

    public void setCantidadTemporadas(int cantidadTemporadas) {
        this.cantidadTemporadas = cantidadTemporadas;
    }

}
