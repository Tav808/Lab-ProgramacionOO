
public class Libro {
    private String titulo;
    private String isbn;
    private int cantidadPaginas;

    public Libro(String titulo, String isbn, int cantidadPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public void mostrarFicha() {
        System.out.println("Título: " + titulo + " | ISBN: " + isbn + " | Cantidad de páginas: " + cantidadPaginas);
    }

}
