public class Producto {
    protected int codigo;
    private int precio;

    public Producto(int codigo, int precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int calcularPrecioFinal() {
        return this.precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
