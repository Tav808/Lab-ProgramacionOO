public class Seleccion {

    private String nombre;
    private String continente;
    private int puntos;
    private int jugadoresConvocados;
    private boolean clasificado;
    private DirectorTecnico directorTecnico;

    public Seleccion(String nombre, String continente, int puntos, int jugadoresConvocados, boolean clasificado) {
        this.nombre = nombre;
        this.continente = continente;
        this.puntos = puntos;
        this.jugadoresConvocados = jugadoresConvocados;
        this.clasificado = clasificado;
        this.directorTecnico = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getJugadoresConvocados() {
        return jugadoresConvocados;
    }

    public void setJugadoresConvocados(int jugadoresConvocados) {
        this.jugadoresConvocados = jugadoresConvocados;
    }

    public boolean isClasificado() {
        return clasificado;
    }

    public void setClasificado(boolean clasificado) {
        this.clasificado = clasificado;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(DirectorTecnico directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public void validarJugadoresConvocados() throws IllegalArgumentException {
        if (this.jugadoresConvocados < 1 || this.jugadoresConvocados > 26) {
            throw new IllegalArgumentException("La cantidad de jugadores convocados debe ser entre 1 y 26");
        }
    }

    public void validarParaDisputarPartido() throws JugadoresInsuficientesException {
        if (this.jugadoresConvocados < 11) {
            throw new JugadoresInsuficientesException();
        }
    }

}
