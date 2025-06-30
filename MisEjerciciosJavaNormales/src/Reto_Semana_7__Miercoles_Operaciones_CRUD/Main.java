package Reto_Semana_7__Miercoles_Operaciones_CRUD;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de Usuarios ===");
            System.out.println("1. Insertar usuario");
            System.out.println("2. Leer usuarios");
            System.out.println("3. Actualizar email");
            System.out.println("4. Eliminar usuario");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.next();
                    System.out.print("Email: ");
                    String email = sc.next();
                    UsuarioCrud.insertarUsuario(nombre, email);
                    break;
                case 2:
                    UsuarioCrud.leerUsuarios();
                    break;
                case 3:
                    System.out.print("ID del usuario: ");
                    int id = sc.nextInt();
                    System.out.print("Nuevo email: ");
                    String nuevoEmail = sc.next();
                    UsuarioCrud.actualizarEmail(id, nuevoEmail);
                    break;
                case 4:
                    System.out.print("ID del usuario: ");
                    int idEliminar = sc.nextInt();
                    UsuarioCrud.eliminarUsuario(idEliminar);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
