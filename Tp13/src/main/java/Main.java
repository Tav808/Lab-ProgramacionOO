import Model.Empleado;
import Service.EmpleadoService;
import Excepciones.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmpleadoService service = new EmpleadoService();

        try {
            service.Registrar("Juan", "Perez", 35123456, "Desarrollador", 450000.0);
            service.Registrar("Maria", "Gomez", 40987654, "Analista", 520000.0);
            service.Registrar("Carlos", "Lopez", 38111222, "Gerente", 850000.0);
            service.Registrar("Ana", "Martinez", 42333444, "Soporte", 380000.0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            service.Registrar("Lucas", "Rodriguez", 12345, "Desarrollador", 400000.0);
        } catch (DniInvalidoException e) {
            System.out.println("Excepción: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            service.Registrar("Pedro", "Sosa", 35123456, "Analista", 480000.0);
        } catch (DniDuplicadoException e) {
            System.out.println("Excepción: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            service.Registrar("Laura", "Fernandez", 39555666, "Desarrollador", -100.0);
        } catch (SalarioInvalidoException e) {
            System.out.println("Excepción: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            service.Registrar("Gabriel", "Torres", 37777888, "Astronauta", 500000.0);
        } catch (CargoInvalidoException e) {
            System.out.println("Excepción: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        List<Empleado> lista = service.ListarTodo();
        for (Empleado emp : lista) {
            System.out.println(emp);
        }

        try {
            Empleado emp = service.ListarPorId(999);
            System.out.println(emp);
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("Excepción: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            service.Actualizar(999, "Fantasma", "Inexistente", 39999999, "Analista", 500000.0);
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("Excepción: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            service.Actualizar(1, "Juan Carlos", "Perez Gomez", 35123456, "Gerente", 600000.0);
            Empleado modificado = service.ListarPorId(1);
            System.out.println(modificado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            service.Eliminar(2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            service.Eliminar(2);
        } catch (EmpleadoYaInactivoException e) {
            System.out.println("Excepción: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        List<Empleado> listaFinal = service.ListarTodo();
        for (Empleado emp : listaFinal) {
            System.out.println(emp);
        }
    }
}
