package Dao;

import Model.Empleado;
import java.util.List;

public interface EmpleadoDAO {

    void Crear(Empleado e);

    void Actualizar(Empleado e);

    void Eliminar(int id);

    Empleado ListarPorId(int id);

    List<Empleado> ListarTodo();

    Empleado BuscarPorDni(int dni);
}
