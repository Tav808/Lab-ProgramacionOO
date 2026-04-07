public class Vehiculo {
    protected int Patente;
    protected String Modelo;

    public Vehiculo(String Modelo, int Patente) {
        this.Modelo = Modelo;
        this.Patente = Patente;
    }

    public void Mostrar() {
        System.out.println("Modelo: " + Modelo + ", Patente: " + Patente);
    }
}
