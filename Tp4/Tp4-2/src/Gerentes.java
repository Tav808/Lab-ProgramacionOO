public class Gerentes extends Empleados {
    private int bonoResponsabilidad;

    public Gerentes(String legajo, int sueldoBase, int bonoResponsabilidad) {
        super(legajo, sueldoBase);
        this.bonoResponsabilidad = bonoResponsabilidad;
    }

    public int getBonoResponsabilidad() {
        return bonoResponsabilidad;
    }

    public void setBonoResponsabilidad(int bonoResponsabilidad) {
        this.bonoResponsabilidad = bonoResponsabilidad;
    }
}
