package Mini_Proyecto_BD_BibliotecaLibros;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibroCRUD crud = new LibroCRUD();

        int opcion;
        do {
            System.out.println("\n📚 Menú Biblioteca");
            System.out.println("1. Insertar libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Actualizar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar salto de línea

            switch (opcion) {
                case 1:
                    Libro nuevoLibro = new Libro();
                    System.out.print("Título: ");
                    nuevoLibro.setTitulo(scanner.nextLine());
                    System.out.print("Autor: ");
                    nuevoLibro.setAutor(scanner.nextLine());
                    System.out.print("Año de publicación: ");
                    nuevoLibro.setAnioPublicacion(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Género: ");
                    nuevoLibro.setGenero(scanner.nextLine());
                    System.out.print("¿Está disponible? (true/false): ");
                    nuevoLibro.setDisponible(scanner.nextBoolean());
                    crud.insertarLibro(nuevoLibro);
                    break;

                case 2:
                    List<Libro> libros = crud.obtenerTodosLosLibros();
                    for (Libro libro : libros) {
                        System.out.println("📘 ID: " + libro.getId());
                        System.out.println("   Título: " + libro.getTitulo());
                        System.out.println("   Autor: " + libro.getAutor());
                        System.out.println("   Año: " + libro.getAnioPublicacion());
                        System.out.println("   Género: " + libro.getGenero());
                        System.out.println("   Disponible: " + libro.isDisponible());
                        System.out.println("----------------------------");
                    }
                    break;

                case 3:
                    System.out.print("ID del libro a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();

                    Libro libroActualizado = new Libro();
                    libroActualizado.setId(idActualizar);
                    System.out.print("Nuevo título: ");
                    libroActualizado.setTitulo(scanner.nextLine());
                    System.out.print("Nuevo autor: ");
                    libroActualizado.setAutor(scanner.nextLine());
                    System.out.print("Nuevo año de publicación: ");
                    libroActualizado.setAnioPublicacion(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Nuevo género: ");
                    libroActualizado.setGenero(scanner.nextLine());
                    System.out.print("¿Está disponible? (true/false): ");
                    libroActualizado.setDisponible(scanner.nextBoolean());

                    crud.actualizarLibro(libroActualizado);
                    break;

                case 4:
                    System.out.print("ID del libro a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    crud.eliminarLibro(idEliminar);
                    break;

                case 5:
                    System.out.println("👋 Saliendo del sistema...");
                    break;

                default:
                    System.out.println("❌ Opción no válida. Intenta otra vez.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}

