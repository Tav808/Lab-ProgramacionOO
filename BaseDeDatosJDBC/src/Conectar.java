
import java.sql.*;

public class Conectar {

    private static final String url = "jdbc:mysql://localhost:3306/jdbc?useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "";

    public static Connection conectar1() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
