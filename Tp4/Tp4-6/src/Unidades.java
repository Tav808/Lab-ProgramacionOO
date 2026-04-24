public class Unidades {
    private int idInterno;
    private int cantidadPasajero;

    public Unidades(int idInterno, int cantidadPasajero) {
        this.idInterno = idInterno;
        this.cantidadPasajero = cantidadPasajero;
    }

    public void arrancar() {
        System.out.println("La unidad esta arrancando");
    }

    public void detener() {
        System.out.println("La unidad se esta deteniendo");
    }

    public int getIdInterno() {
        return idInterno;
    }

    public void setIdInterno(int idInterno) {
        this.idInterno = idInterno;
    }

    public int getCantidadPasajero() {
        return cantidadPasajero;
    }

    public void setCantidadPasajero(int cantidadPasajero) {
        this.cantidadPasajero = cantidadPasajero;
    }
}
