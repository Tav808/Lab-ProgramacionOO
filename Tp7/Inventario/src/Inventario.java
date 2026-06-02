public class Inventario {
    private Producto[] listaProductos;

    public Inventario(Producto[] productos) {
        this.listaProductos = productos;
    }

    public void listarProductos() {
        for (Producto p : listaProductos) {
            if (p != null) {
                p.mostrarFicha();
            }
        }
    }

    public void mostrarCantidadTotal() {
        System.out.println("Cantidad total de productos en inventario: " + listaProductos.length);
    }
}