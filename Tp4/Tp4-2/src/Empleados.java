public class Empleados {
    protected String legajo;
    protected int sueldoBase;

    public Empleados(String legajo, int sueldoBase) {
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}
