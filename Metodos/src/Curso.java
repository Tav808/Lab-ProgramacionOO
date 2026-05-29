import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Estudiante> alumnos;

    public Curso(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void inscribirEstudiante(Estudiante e) {
        alumnos.add(e);
    }

    public void darDeBaja(Estudiante e) {
        alumnos.remove(e);
    }

    public void listarAlumnos() {
        for (Estudiante e : alumnos) {
            e.mostrarFicha();
        }
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }

}
