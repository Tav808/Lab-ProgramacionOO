public class AlumnoLibreException extends Exception {

    public AlumnoLibreException() {
        super("El alumno se encuentra libre por exceso de inasistencias, no puede realizar la operacion academica especial");
    }
}
