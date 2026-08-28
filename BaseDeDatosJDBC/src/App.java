import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException {

        try {
            Conectar.conectar1();
            System.out.println("Conectado!");

        } catch (SQLException e) {

            e.printStackTrace();

        }
        Metodos.InsertarDato("Octavio", "PP", "49000000", "Marketing", true);
        Metodos.InsertarDato("Octavio2", "PP", "490344000", "Marketing", false);
        Metodos.InsertarDato("Octavio3", "PP", "4934500", "Marketing", false);
        Metodos.InsertarDato("Octavio4", "PP", "4900666000", "Marketing", true);
        Metodos.InsertarDato("Octavio5", "PP", "49009990", "Marketing", false);
        Metodos.InsertarDato("Octavio6", "PP", "4988880", "Marketing", true);

        Metodos.EliminarDato(4);
        Metodos.ActualizarDato(2, "Pagni", "Administracion");
        Metodos.LeerDato();

    }
}
