public class PagoEfectivo extends MetodoPago {
    private int cambio;

    public PagoEfectivo(int idmetodopago, double monto, String fechaPago, int cambio) {
        super(idmetodopago, monto, fechaPago);
        this.cambio = cambio;
    }
}
