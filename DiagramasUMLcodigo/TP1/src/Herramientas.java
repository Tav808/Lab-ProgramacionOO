public class Herramientas {
    protected int codigo;
    protected String nombre;

    public Herramientas(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void usar() {
        System.out.println("Usando: " + nombre);
    }

    public void devolver() {
        System.out.println("Devolviendo: " + nombre);
    }
}
