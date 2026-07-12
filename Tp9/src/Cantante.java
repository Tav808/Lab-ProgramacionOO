public class Cantante implements Contratable {

    private String nombre;
    private String generoMusical;
    private int cachet;
    private int cantidadCanciones;
    private String representante;
    private String escenarioAsignado;

    public Cantante(String nombre, String generoMusical, int cachet, int cantidadCanciones, String representante) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.cachet = cachet;
        this.cantidadCanciones = cantidadCanciones;
        this.representante = representante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getCachet() {
        return cachet;
    }

    public void setCachet(int cachet) {
        this.cachet = cachet;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getEscenarioAsignado() {
        return escenarioAsignado;
    }

    public void setEscenarioAsignado(String escenarioAsignado) {
        this.escenarioAsignado = escenarioAsignado;
    }

    @Override
    public void liquidarHonorarios(double impuestos) throws IllegalArgumentException {

        if (impuestos < 0 || impuestos > 100) {
            throw new IllegalArgumentException("El porcentaje de impuestos ingresado no es valido");
        }

        double honorarioFinal = this.cachet - (this.cachet * impuestos / 100);

        System.out.println("Honorarios liquidados a " + this.nombre + ": $" + honorarioFinal);
    }

    @Override
    public void asignarEscenario(String nombreEscenario) throws NullPointerException {

        if (nombreEscenario == null) {
            throw new NullPointerException("El nombre del escenario no puede ser nulo");
        }

        this.escenarioAsignado = nombreEscenario;

        System.out.println(this.nombre + " fue asignado al escenario " + nombreEscenario);
    }
}
