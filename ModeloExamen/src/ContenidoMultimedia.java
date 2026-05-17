public class ContenidoMultimedia {
    protected int id;
    protected String titulo;

    public ContenidoMultimedia(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public void reproducir() {
        System.out.println("Reproduciendo contenido: " + titulo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
