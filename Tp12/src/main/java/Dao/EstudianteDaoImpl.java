package Dao;

import Model.Estudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoImpl implements EstudianteDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/basededatos?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection ConexionBd() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return con;
    }

    @Override
    public void Crear(Estudiante e) {
        String sql = "INSERT INTO estudiantes (nombre, apellido, dni, curso) VALUES (?, ?, ?, ?)";

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null) {

            if (ps != null) {
                ps.setString(1, e.getNombre());
                ps.setString(2, e.getApellido());
                ps.setInt(3, e.getDni());
                ps.setString(4, e.getCurso());

                int filas = ps.executeUpdate();
                System.out.println("Estudiante registrado con éxito. Filas afectadas: " + filas);
            }
        } catch (SQLException ex) {
            System.err.println("Error al registrar estudiante: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public void Actualizar(Estudiante e) {
        String sql;
        boolean actualizaPorId = e.getId() > 0;

        if (actualizaPorId) {
            sql = "UPDATE estudiantes SET nombre = ?, apellido = ?, dni = ?, curso = ? WHERE id = ?";
        } else {
            sql = "UPDATE estudiantes SET nombre = ?, apellido = ?, curso = ? WHERE dni = ?";
        }

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null) {

            if (ps != null) {
                if (actualizaPorId) {
                    ps.setString(1, e.getNombre());
                    ps.setString(2, e.getApellido());
                    ps.setInt(3, e.getDni());
                    ps.setString(4, e.getCurso());
                    ps.setInt(5, e.getId());
                } else {
                    ps.setString(1, e.getNombre());
                    ps.setString(2, e.getApellido());
                    ps.setString(3, e.getCurso());
                    ps.setInt(4, e.getDni());
                }

                int filasAfectadas = ps.executeUpdate();
                System.out.println("Filas actualizadas: " + filasAfectadas);
            }
        } catch (SQLException ex) {
            System.err.println("Error al actualizar estudiante: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public void Eliminar(int id) {
        String sql = "DELETE FROM estudiantes WHERE id = ?";

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null) {

            if (ps != null) {
                ps.setInt(1, id);
                int filasAfectadas = ps.executeUpdate();
                System.out.println("Filas eliminadas: " + filasAfectadas);
            }
        } catch (SQLException ex) {
            System.err.println("Error al eliminar estudiante: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public Estudiante ListarPorId(int id) {
        String sql = "SELECT id, nombre, apellido, dni, curso FROM estudiantes WHERE id = ?";
        Estudiante estudiante = null;

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null) {

            if (ps != null) {
                ps.setInt(1, id);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        estudiante = new Estudiante(
                                rs.getInt("id"),
                                rs.getString("nombre"),
                                rs.getString("apellido"),
                                rs.getInt("dni"),
                                rs.getString("curso")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al listar estudiante por ID: " + ex.getMessage());
            ex.printStackTrace();
        }

        return estudiante;
    }

    @Override
    public List<Estudiante> ListarTodo() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT id, nombre, apellido, dni, curso FROM estudiantes";

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null;
             ResultSet rs = ps != null ? ps.executeQuery() : null) {

            if (rs != null) {
                while (rs.next()) {
                    Estudiante estudiante = new Estudiante(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getInt("dni"),
                            rs.getString("curso")
                    );
                    estudiantes.add(estudiante);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al listar todos los estudiantes: " + ex.getMessage());
            ex.printStackTrace();
        }

        return estudiantes;
    }
}
