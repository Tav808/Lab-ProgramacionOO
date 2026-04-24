public class Envio {
    private int idenvio;
    private String destino;
    private String estado;
    private int numSeguimiento;

    public Envio(int idenvio, String destino, String estado, int numSeguimiento) {
        this.idenvio = idenvio;
        this.destino = destino;
        this.estado = estado;
        this.numSeguimiento = numSeguimiento;
    }
}
