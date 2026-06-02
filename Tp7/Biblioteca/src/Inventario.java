public class Inventario {
    private Libro[] listaLibros;

    public Inventario(Libro[] productos) {
        this.listaLibros = productos;
    }

    public void listarProductos() {
        for (Libro p : listaLibros) {
            if (p != null) {
                p.mostrarFicha();
            }
        }
    }

    public void mostrarCantidadTotal() {
        System.out.println("Cantidad total de libros en inventario: " + listaLibros.length);
    }
}