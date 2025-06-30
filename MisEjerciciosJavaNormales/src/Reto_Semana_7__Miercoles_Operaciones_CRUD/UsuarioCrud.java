package Reto_Semana_7__Miercoles_Operaciones_CRUD;

import java.sql.*;

public class UsuarioCrud {

    public static void insertarUsuario(String nombre, String email) {
        String sql = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, email);
            ps.executeUpdate();
            System.out.println("Usuario insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

    public static void leerUsuarios() {
        String sql = "SELECT * FROM usuarios";
        try (Connection conn = Conexion.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("nombre") + " | " +
                        rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }

    public static void actualizarEmail(int id, String nuevoEmail) {
        String sql = "UPDATE usuarios SET email = ? WHERE id = ?";
        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoEmail);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Email actualizado.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }

    public static void eliminarUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Usuario eliminado.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }
}

