package Service;

import Dao.EmpleadoDAO;
import Dao.EmpleadoDaoImpl;
import Excepciones.*;
import Model.Empleado;

import java.util.Arrays;
import java.util.List;

public class EmpleadoService {

    private final EmpleadoDAO empleadoDAO;
    private static final List<String> Cargos = Arrays.asList("Analista", "Desarrollador", "Gerente", "Soporte");

    public EmpleadoService() {
        this.empleadoDAO = new EmpleadoDaoImpl();
    }

    public EmpleadoService(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

    public void Registrar(String nombre, String apellido, int dni, String cargo, double salario)
            throws DniInvalidoException, DniDuplicadoException, SalarioInvalidoException, CargoInvalidoException {

        int digitosDni = String.valueOf(Math.abs(dni)).length();
        if (digitosDni < 7 || digitosDni > 8) {
            throw new DniInvalidoException("DNI inválido: debe tener 7 u 8 dígitos.");
        }

        if (empleadoDAO.BuscarPorDni(dni) != null) {
            throw new DniDuplicadoException("DNI duplicado: ya existe en la base de datos.");
        }

        if (salario <= 0) {
            throw new SalarioInvalidoException("Salario inválido: debe ser mayor a 0.");
        }

        if (!Cargos.contains(cargo)) {
            throw new CargoInvalidoException("Cargo inválido: debe ser Analista, Desarrollador, Gerente o Soporte.");
        }

        Empleado e = new Empleado(nombre, apellido, dni, cargo, salario, true);
        empleadoDAO.Crear(e);
    }

    public void Actualizar(int id, String nombre, String apellido, int dni, String cargo, double salario)
            throws EmpleadoNoEncontradoException, DniInvalidoException, DniDuplicadoException, SalarioInvalidoException,
            CargoInvalidoException {

        Empleado empExistente = empleadoDAO.ListarPorId(id);
        if (empExistente == null) {
            throw new EmpleadoNoEncontradoException("Empleado no encontrado con ID: " + id);
        }

        int digitosDni = String.valueOf(Math.abs(dni)).length();
        if (digitosDni < 7 || digitosDni > 8) {
            throw new DniInvalidoException("DNI inválido: debe tener 7 u 8 dígitos.");
        }

        Empleado empConDni = empleadoDAO.BuscarPorDni(dni);
        if (empConDni != null && empConDni.getId() != id) {
            throw new DniDuplicadoException("DNI duplicado: pertenece a otro empleado.");
        }

        if (salario <= 0) {
            throw new SalarioInvalidoException("Salario inválido: debe ser mayor a 0.");
        }

        if (!Cargos.contains(cargo)) {
            throw new CargoInvalidoException("Cargo inválido: debe ser Analista, Desarrollador, Gerente o Soporte.");
        }

        Empleado e = new Empleado(id, nombre, apellido, dni, cargo, salario, empExistente.isActivo());
        empleadoDAO.Actualizar(e);
    }

    public void Eliminar(int id) throws EmpleadoNoEncontradoException, EmpleadoYaInactivoException {
        Empleado emp = empleadoDAO.ListarPorId(id);

        if (emp == null) {
            throw new EmpleadoNoEncontradoException("Empleado no encontrado con ID: " + id);
        }

        if (!emp.isActivo()) {
            throw new EmpleadoYaInactivoException("El empleado ya se encuentra inactivo.");
        }

        empleadoDAO.Eliminar(id);
    }

    public Empleado ListarPorId(int id) throws EmpleadoNoEncontradoException {
        Empleado emp = empleadoDAO.ListarPorId(id);

        if (emp == null) {
            throw new EmpleadoNoEncontradoException("Empleado no encontrado con ID: " + id);
        }

        return emp;
    }

    public List<Empleado> ListarTodo() {
        return empleadoDAO.ListarTodo();
    }
}