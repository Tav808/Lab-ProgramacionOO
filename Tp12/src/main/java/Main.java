import Model.Estudiante;
import Service.EstudianteService;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EstudianteService service = new EstudianteService();

        service.Registrar("Juan", "Perez", 10000001, "Java Inicial");
        service.Registrar("Maria", "Gomez", 10000002, "Java Avanzado");
        service.Registrar("Carlos", "Lopez", 10000003, "Bases de Datos");
        service.Registrar("Ana", "Martinez", 10000004, "Programacion OO");
        service.Registrar("Lucas", "Rodriguez", 10000005, "Desarrollo Web");
        service.Registrar("Sofia", "Fernandez", 10000006, "Estructuras de Datos");
        service.Registrar("Mateo", "Diaz", 10000007, "Algoritmos");
        service.Registrar("Valentina", "Torres", 10000008, "Ingenieria de Software");
        service.Registrar("Joaquin", "Alvarez", 10000009, "Redes y Seguridad");
        service.Registrar("Camila", "Romero", 10000010, "Inteligencia Artificial");

        System.out.println("--- Lista de estudiantes ---");
        List<Estudiante> lista = service.ListarTodo();
        for (Estudiante e : lista) {
            System.out.println(e);
        }

        System.out.println("\n--- Eliminando estudiante ID = 4 ---");
        service.Eliminar(4);

        System.out.println("\n--- Actualizando estudiante ID = 6 ---");
        service.Actualizar(6, "Sofia Elena", "Fernandez Paz", 10000006, "Ciencia de Datos");

        System.out.println("\n--- Actualizando estudiante ID = 8 ---");
        service.Actualizar(8, "Valentina Belen", "Torres Rossi", 10000008, "Arquitectura de Software");

        System.out.println("\n--- Lista final ---");
        List<Estudiante> listaFinal = service.ListarTodo();
        for (Estudiante e : listaFinal) {
            System.out.println(e);
        }
    }
}
