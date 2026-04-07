public class HerramientasElectricas extends Herramientas {
    protected int voltaje;

    public HerramientasElectricas(String nombre, int codigo, int voltaje) {
        super(nombre, codigo);
        this.voltaje = voltaje;
    }

    public void conectar1() {
        System.out.println("Conectando " + nombre + " al voltaje: " + voltaje + "V");
    }

}