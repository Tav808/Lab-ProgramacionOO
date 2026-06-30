public class Alumno {

    private int dni;
    private String nombre;
    private String apellido;
    private String curso;
    private int inasistencias;
    private String estadoAcademico;
    private Tutor tutor;

    public static final int LIMITE_INASISTENCIAS = 15;

    public Alumno(int dni, String nombre, String apellido, String curso, int inasistencias, String estadoAcademico) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.inasistencias = inasistencias;
        this.estadoAcademico = estadoAcademico;
        this.tutor = null;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public void setInasistencias(int inasistencias) {
        this.inasistencias = inasistencias;
    }

    public String getEstadoAcademico() {
        return estadoAcademico;
    }

    public void setEstadoAcademico(String estadoAcademico) {
        this.estadoAcademico = estadoAcademico;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public void registrarInasistencias(int cantidad) throws IllegalArgumentException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad de inasistencias no puede ser negativa");
        }

        this.inasistencias += cantidad;
    }

    public boolean esLibre() {
        return this.inasistencias > LIMITE_INASISTENCIAS;
    }

    public void validarOperacionAcademicaEspecial() throws AlumnoLibreException {
        if (this.esLibre()) {
            throw new AlumnoLibreException();
        }
    }

}
