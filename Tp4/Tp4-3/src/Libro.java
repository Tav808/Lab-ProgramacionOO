public class Libro extends Producto {
    private String autor;

    public Libro(int codigo, int precio, String autor) {
        super(codigo, precio);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}