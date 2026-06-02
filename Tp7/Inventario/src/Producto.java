
public class Producto {
    private String nombre;
    private String codigo;
    private Double precio;

    public Producto(String nombre, String codigo, Double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre + " | Código: " + codigo + " | Precio: " + precio);
    }

}
