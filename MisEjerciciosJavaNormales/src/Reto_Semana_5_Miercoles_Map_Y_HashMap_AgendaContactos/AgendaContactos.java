package Reto_Semana_5_Miercoles_Map_Y_HashMap_AgendaContactos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaContactos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> agenda = new HashMap<>();

        int opcion;

        do {
            // Mostrar menú
            System.out.println("\n📱 AGENDA DE CONTACTOS");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Introduce el teléfono: ");
                    String telefono = scanner.nextLine();

                    agenda.put(nombre, telefono);
                    System.out.println("✅ Contacto añadido.");
                    break;

                case 2:
                    System.out.print("Introduce el nombre a buscar: ");
                    String buscar = scanner.nextLine();

                    if (agenda.containsKey(buscar)) {
                        System.out.println("📞 Teléfono de " + buscar + ": " + agenda.get(buscar));
                    } else {
                        System.out.println("❌ Contacto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce el nombre a eliminar: ");
                    String eliminar = scanner.nextLine();

                    if (agenda.containsKey(eliminar)) {
                        agenda.remove(eliminar);
                        System.out.println("🗑️ Contacto eliminado.");
                    } else {
                        System.out.println("❌ Contacto no encontrado.");
                    }
                    break;

                case 4:
                    if (agenda.isEmpty()) {
                        System.out.println("📭 La agenda está vacía.");
                    } else {
                        System.out.println("\n📋 Lista de contactos:");
                        for (Map.Entry<String, String> contacto : agenda.entrySet()) {
                            System.out.println("🔹 " + contacto.getKey() + ": " + contacto.getValue());
                        }
                    }
                    break;

                case 5:
                    System.out.println("👋 ¡Hasta luego!");
                    break;

                default:
                    System.out.println("❗ Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}

