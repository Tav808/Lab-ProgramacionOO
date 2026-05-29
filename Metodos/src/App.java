public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("5°2");

        Estudiante estudiante1 = new Estudiante("Tau", "42705556", 10);
        Estudiante estudiante2 = new Estudiante("Juan", "42705557", 8);
        Estudiante estudiante3 = new Estudiante("Molina", "42705558", 6);

        curso1.inscribirEstudiante(estudiante1);
        curso1.inscribirEstudiante(estudiante2);
        curso1.inscribirEstudiante(estudiante3);

        System.out.println(curso1.cantidadAlumnos());
        curso1.listarAlumnos();

        curso1.darDeBaja(1);
        curso1.listarAlumnos();
    }
}
