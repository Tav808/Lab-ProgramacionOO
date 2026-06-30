import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Escuela escuela = new Escuela();

        Alumno alumno1 = new Alumno(40123456, "Octavio", "Pagni", "5to Computacion", 5, "Regular");
        Tutor tutor1 = new Tutor("Alejandro", "Pagni", "11-4444-5555");
        alumno1.setTutor(tutor1);

        Alumno alumno2 = new Alumno(40987654, "Juan", "Suarez", "5to Computacion", 20, "Libre");

        escuela.agregarAlumno(alumno1);
        escuela.agregarAlumno(alumno2);

        Alumno consultado = escuela.consultarAlumno(5);
        if (consultado != null) {
            System.out.println("Alumno encontrado: " + consultado.getNombre());
        }

        System.out.println("Posicion 0: " + escuela.getAlumnos().get(0).getNombre());
        escuela.registrarInasistencias(0, sc);

        escuela.consultarTutor(0);
        escuela.consultarTutor(1);

        try {
            alumno1.registrarInasistencias(-3);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Validacion de inasistencias finalizada");
        }

        try {
            alumno2.validarOperacionAcademicaEspecial();
            System.out.println("El alumno puede realizar la operacion");

        } catch (AlumnoLibreException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Fin del programa");
        }

        sc.close();
    }
}
