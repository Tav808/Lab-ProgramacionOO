public class PagoTarjeta extends MetodoPago {
    private int numTarjeta;
    private String titular;
    private String vencimiento;

    public PagoTarjeta(int idmetodopago, double monto, String fechaPago, int numTarjeta, String titular,
            String vencimiento) {
        super(idmetodopago, monto, fechaPago);
        this.numTarjeta = numTarjeta;
        this.titular = titular;
        this.vencimiento = vencimiento;
    }
}
