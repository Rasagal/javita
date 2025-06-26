package Mini_Proyecto_BD_BibliotecaLibros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
        private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
        private static final String USER = "????";
        private static final String PASS = "????";

        public static Connection conectar(){
            try {
                return DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException e) {
                System.out.println("Error de conexión: " + e.getMessage());
                return null;
            }
        }
}

