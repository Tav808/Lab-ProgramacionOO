public class Tren extends Unidades {
    public int cantidadVagones;

    public Tren(int idInterno, int cantidadPasajero, int cantidadVagones) {
        super(idInterno, cantidadPasajero);
        this.cantidadVagones = cantidadVagones;
    }

    public int getCantidadVagones() {
        return cantidadVagones;
    }

    public void setCantidadVagones(int cantidadVagones) {
        this.cantidadVagones = cantidadVagones;
    }
}
