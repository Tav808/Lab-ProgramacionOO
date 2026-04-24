public class PagoTransferencia extends MetodoPago {
    private int cbu;
    private String banco;
    private String comprobante;

    public PagoTransferencia(int idmetodopago, double monto, String fechaPago, int cbu, String banco,
            String comprobante) {
        super(idmetodopago, monto, fechaPago);
        this.cbu = cbu;
        this.banco = banco;
        this.comprobante = comprobante;
    }
}
