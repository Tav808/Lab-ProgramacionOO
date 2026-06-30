import java.util.ArrayList;
import java.util.Scanner;

public class Escuela {

    private ArrayList<Alumno> alumnos;

    public Escuela() {
        this.alumnos = new ArrayList<Alumno>();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno a) {
        this.alumnos.add(a);
    }

    public Alumno consultarAlumno(int posicion) {
        try {
            return this.alumnos.get(posicion);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe un alumno en la posicion " + posicion);
            return null;
        }
    }

    public void registrarInasistencias(int posicion, Scanner sc) {
        try {
            Alumno a = this.alumnos.get(posicion);

            System.out.println("Ingrese la cantidad de inasistencias a registrar: ");
            int cantidad = Integer.parseInt(sc.nextLine());

            a.registrarInasistencias(cantidad);
            System.out.println("Inasistencias registradas correctamente");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe un alumno en la posicion " + posicion);

        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es numerico");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Operacion de registro de inasistencias finalizada");
        }
    }

    public void consultarTutor(int posicion) {
        try {
            Alumno a = this.alumnos.get(posicion);

            System.out.println("Tutor: " + a.getTutor().getNombre() + " " + a.getTutor().getApellido());
            System.out.println("Telefono: " + a.getTutor().getTelefono());

        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe un alumno en la posicion " + posicion);

        } catch (NullPointerException e) {
            System.out.println("El alumno no posee tutor registrado");
        }
    }

}
