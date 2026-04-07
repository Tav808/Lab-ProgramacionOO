public class Libros {

    protected int ISBN;
    protected String Titulo;

    public Libros(int ISBN, String Titulo) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
    }

    public void Mostrar() {
        System.out.println("[ISBN: " + ISBN + "] " + Titulo);
    }
}
