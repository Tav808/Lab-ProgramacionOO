package Dao;

import Model.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDaoImpl implements EmpleadoDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/globant_db?useSSL=false&serverTimezone=UTC";
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
    public void Crear(Empleado e) {
        String sql = "INSERT INTO empleados (nombre, apellido, dni, cargo, salario, activo) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null) {

            if (ps != null) {
                ps.setString(1, e.getNombre());
                ps.setString(2, e.getApellido());
                ps.setInt(3, e.getDni());
                ps.setString(4, e.getCargo());
                ps.setDouble(5, e.getSalario());
                ps.setBoolean(6, e.isActivo());

                ps.executeUpdate();
                System.out.println("Empleado registrado correctamente.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al registrar empleado: " + ex.getMessage());
        }
    }

    @Override
    public void Actualizar(Empleado e) {
        String sql = "UPDATE empleados SET nombre = ?, apellido = ?, dni = ?, cargo = ?, salario = ?, activo = ? WHERE id = ?";

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null) {

            if (ps != null) {
                ps.setString(1, e.getNombre());
                ps.setString(2, e.getApellido());
                ps.setInt(3, e.getDni());
                ps.setString(4, e.getCargo());
                ps.setDouble(5, e.getSalario());
                ps.setBoolean(6, e.isActivo());
                ps.setInt(7, e.getId());

                ps.executeUpdate();
                System.out.println("Empleado actualizado correctamente.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al actualizar empleado: " + ex.getMessage());
        }
    }

    @Override
    public void Eliminar(int id) {
        String sql = "UPDATE empleados SET activo = false WHERE id = ?";

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null) {

            if (ps != null) {
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("Empleado eliminado correctamente.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al eliminar empleado: " + ex.getMessage());
        }
    }

    @Override
    public Empleado ListarPorId(int id) {
        String sql = "SELECT id, nombre, apellido, dni, cargo, salario, activo FROM empleados WHERE id = ?";
        Empleado empleado = null;

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null) {

            if (ps != null) {
                ps.setInt(1, id);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        empleado = new Empleado(
                                rs.getInt("id"),
                                rs.getString("nombre"),
                                rs.getString("apellido"),
                                rs.getInt("dni"),
                                rs.getString("cargo"),
                                rs.getDouble("salario"),
                                rs.getBoolean("activo")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al buscar empleado por ID: " + ex.getMessage());
        }

        return empleado;
    }

    @Override
    public List<Empleado> ListarTodo() {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT id, nombre, apellido, dni, cargo, salario, activo FROM empleados WHERE activo = true";

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null;
             ResultSet rs = ps != null ? ps.executeQuery() : null) {

            if (rs != null) {
                while (rs.next()) {
                    Empleado empleado = new Empleado(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getInt("dni"),
                            rs.getString("cargo"),
                            rs.getDouble("salario"),
                            rs.getBoolean("activo")
                    );
                    empleados.add(empleado);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al listar todos los empleados activos: " + ex.getMessage());
        }

        return empleados;
    }

    @Override
    public Empleado BuscarPorDni(int dni) {
        String sql = "SELECT id, nombre, apellido, dni, cargo, salario, activo FROM empleados WHERE dni = ?";
        Empleado empleado = null;

        try (Connection con = ConexionBd();
             PreparedStatement ps = con != null ? con.prepareStatement(sql) : null) {

            if (ps != null) {
                ps.setInt(1, dni);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        empleado = new Empleado(
                                rs.getInt("id"),
                                rs.getString("nombre"),
                                rs.getString("apellido"),
                                rs.getInt("dni"),
                                rs.getString("cargo"),
                                rs.getDouble("salario"),
                                rs.getBoolean("activo")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al buscar empleado por DNI: " + ex.getMessage());
        }

        return empleado;
    }
}
