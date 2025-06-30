package TestConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tubasededatos";
        String user = "root";
        String password = "root1234";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexión exitosa a la base de datos!");
        } catch (SQLException e) {
            System.out.println("Error en la conexión:");
            e.printStackTrace();
        }
    }
}
