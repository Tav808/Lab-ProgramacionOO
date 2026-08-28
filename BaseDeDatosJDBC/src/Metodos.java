import java.sql.*;

public class Metodos {
    public static void InsertarDato(String nombre, String apellido, String dni, String rubro, Boolean actual) {
        String sql = "Insert into vendedores (nombre, apellido, dni, rubro, actual) values (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = Conectar.conectar1().prepareStatement(sql)) {
            System.out.println("Insertando...");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, dni);
            ps.setString(4, rubro);
            ps.setBoolean(5, actual);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void LeerDato() {
        String query = "SELECT id, nombre, apellido, dni, rubro, actual FROM vendedores";

        try (PreparedStatement ps = Conectar.conectar1().prepareStatement(query)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String dni = rs.getString("dni");
                    String rubro = rs.getString("rubro");
                    Boolean actual = rs.getBoolean("actual");

                    System.out.println(
                            id + " - " + nombre + " - " + apellido + " - " + dni + " - " + rubro + " - " + actual);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void ActualizarDato(int id, String apellidoN, String rubroN) {
        String sql = "UPDATE vendedores SET apellido = ?, rubro = ? WHERE id = ?";

        try (PreparedStatement ps = Conectar.conectar1().prepareStatement(sql)) {
            ps.setString(1, apellidoN);
            ps.setString(2, rubroN);
            ps.setInt(3, id);
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas actualizadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void EliminarDato(int id) {
        String sql = "DELETE FROM vendedores WHERE id = ?";

        try (PreparedStatement ps = Conectar.conectar1().prepareStatement(sql)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas eliminadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
