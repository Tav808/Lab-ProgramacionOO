package Service;

import Dao.EstudianteDAO;
import Dao.EstudianteDaoImpl;
import Model.Estudiante;
import java.util.List;

public class EstudianteService {

    private final EstudianteDAO estudianteDAO;

    public EstudianteService() {
        this.estudianteDAO = new EstudianteDaoImpl();
    }

    public EstudianteService(EstudianteDAO estudianteDAO) {
        this.estudianteDAO = estudianteDAO;
    }

    public void Registrar(String nombre, String apellido, int dni, String curso) {
        Estudiante e = new Estudiante(nombre, apellido, dni, curso);
        estudianteDAO.Crear(e);
    }

    public void Actualizar(String nombre, String apellido, int dni, String curso) {
        Estudiante e = new Estudiante(nombre, apellido, dni, curso);
        estudianteDAO.Actualizar(e);
    }

    public void Actualizar(int id, String nombre, String apellido, int dni, String curso) {
        Estudiante e = new Estudiante(id, nombre, apellido, dni, curso);
        estudianteDAO.Actualizar(e);
    }

    public void Eliminar(int id) {
        estudianteDAO.Eliminar(id);
    }

    public Estudiante ListarPorId(int id) {
        return estudianteDAO.ListarPorId(id);
    }

    public List<Estudiante> ListarTodo() {
        return estudianteDAO.ListarTodo();
    }
}
