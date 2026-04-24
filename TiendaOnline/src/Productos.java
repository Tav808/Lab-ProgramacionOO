public class Productos {
    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;

    public Productos(int idProducto, String nombre, double precio, int stock, String descripcion, String categoria,
            String imagen, int idLineaProducto, int idProveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}
