
public class Jugador {
    private String nombre;
    private int edad;
    private String posicion;
    private String equipo;
    private boolean estaConvocado;

    public Jugador(String nombre, int edad, String posicion, String equipo, boolean estaConvocado) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.equipo = equipo;
        this.estaConvocado = estaConvocado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public boolean getEstaConvocado() {
        return estaConvocado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setEstaConvocado(boolean estaConvocado) {
        this.estaConvocado = estaConvocado;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Posicion: "
                + posicion + " | Equipo: " + equipo + " | Esta convocado: " + estaConvocado);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Posicion: "
                + posicion + " | Equipo: " + equipo + " | Esta convocado: " + estaConvocado;
    }
}
