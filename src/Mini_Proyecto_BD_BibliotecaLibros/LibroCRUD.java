package Mini_Proyecto_BD_BibliotecaLibros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LibroCRUD{

    public void insertarLibro(Libro libro) {

        String sql = "INSERT INTO libros (titulo, autor, aniopublicacion, genero, disponible) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setInt(3, libro.getAnioPublicacion());
            ps.setString(4, libro.getGenero());
            ps.setBoolean(5, libro.isDisponible());

            ps.executeUpdate();
            ps.close();
            conn.close();

            System.out.println("✅ Libro insertado correctamente.");
        } catch (Exception e) {
            System.out.println("❌ Error al insertar libro: " + e.getMessage());
        }
    }
    public List<Libro> obtenerTodosLosLibros(){
            List<Libro> listaLibros = new ArrayList<>();
            String sql = "Select * FROM libros";

            try {
                Connection conn = Conexion.conectar();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Libro libro = new Libro();
                    libro.setId(rs.getInt("id"));
                    libro.setTitulo(rs.getString("titulo"));
                    libro.setAutor(rs.getString("autor"));
                    libro.setAnioPublicacion(rs.getInt("aniopublicacion"));
                    libro.setGenero(rs.getString("genero"));
                    libro.setDisponible(rs.getBoolean("disponible"));
                    listaLibros.add(libro);
                }
                rs.close();
                ps.close();
                conn.close();

            }catch (Exception e){
                System.out.println("❌ Error al obtener libros: " + e.getMessage());
            }

            return listaLibros;
        }

    public void actualizarLibro(Libro libro){
        String sql = "UPDATE libros SET titulo = ?, autor = ?, aniopublicacion = ?, genero = ?, disponible = ? WHERE id = ?";

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setInt(3, libro.getAnioPublicacion());
            ps.setString(4, libro.getGenero());
            ps.setBoolean(5, libro.isDisponible());
            ps.setInt(6, libro.getId());

            int filasActualizadas = ps.executeUpdate();

            ps.close();
            conn.close();

            if (filasActualizadas > 0) {
                System.out.println("✅ Libro actualizado correctamente.");
            } else {
                System.out.println("⚠️ No se encontró el libro con ID: " + libro.getId());
            }

        } catch (Exception e) {
            System.out.println("❌ Error al actualizar libro: " + e.getMessage());
        }
    }

    public void eliminarLibro(int id) {
        String sql = "DELETE FROM libros WHERE id = ?";

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int filasEliminadas = ps.executeUpdate();

            ps.close();
            conn.close();

            if (filasEliminadas > 0) {
                System.out.println("✅ Libro eliminado correctamente.");
            } else {
                System.out.println("⚠️ No se encontró el libro con ID: " + id);
            }

        } catch (Exception e) {
            System.out.println("❌ Error al eliminar libro: " + e.getMessage());
        }
    }
}

