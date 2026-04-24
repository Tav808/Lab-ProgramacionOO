public class Pedido {
    private int idpedido;
    private String estado;
    private double costoTotal;
    private int cantidad;

    public Pedido(int idpedido, String estado, double costoTotal, int cantidad) {
        this.idpedido = idpedido;
        this.estado = estado;
        this.costoTotal = costoTotal;
        this.cantidad = cantidad;
    }
}
