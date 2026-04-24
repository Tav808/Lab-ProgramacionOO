public class Libros {

    protected int ISBN;
    protected String Titulo;

    public Libros(int ISBN, String Titulo) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void Mostrar() {
        System.out.println("[ISBN: " + ISBN + "] " + Titulo);
    }
}
