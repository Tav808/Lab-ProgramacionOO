public class Colectivo extends Unidades {
    public int numeroLinea;

    public Colectivo(int idInterno, int cantidadPasajero, int numeroLinea) {
        super(idInterno, cantidadPasajero);
        this.numeroLinea = numeroLinea;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }
}
