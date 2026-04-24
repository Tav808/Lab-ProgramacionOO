public class Operarios extends Empleados {
    private int valorHoraExtra;

    public Operarios(String legajo, int sueldoBase, int valorHoraExtra) {
        super(legajo, sueldoBase);
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(int valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }
}
