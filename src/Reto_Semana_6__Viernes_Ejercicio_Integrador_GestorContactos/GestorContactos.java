package Reto_Semana_6__Viernes_Ejercicio_Integrador_GestorContactos;

import java.io.*;
import java.util.Scanner;

public class GestorContactos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        File contacto = new File("src/Reto_Semana_6__Viernes_Ejercicio_Integrador_GestorContactos/contactos.txt");

        try(BufferedWriter linea = new BufferedWriter(new FileWriter(contacto, true))){
            linea.write("Juan Pérez,612345678,juan@email.com");
            linea.newLine();
            linea.write("Laura Ruiz,698745123,laura@email.com");
            linea.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedReader lector = new BufferedReader(new FileReader(contacto))) {
            String linea;
            int lineaNumerada = 0;
            while ((linea = lector.readLine()) != null){
                System.out.println((lineaNumerada + 1) + " " + linea);
                ++lineaNumerada;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        boolean exit = false;
        while (!exit) {
            String nombre;
            int numeroTelefono;
            String correoElectronico;

            System.out.println("Introduzca el número de la acción que desea realizar: ");
            System.out.println("1.Añadir un nuevo contacto.");
            System.out.println("2.Buscar un contacto por nombre.");
            System.out.println("3.Guardar todos los contactos en mayúsculas en un archivo nuevo contactos_mayus.txt");
            System.out.println("4.Salir");
            int introduceConsola = Integer.parseInt(consola.nextLine());
                switch (introduceConsola){
                    case 1:
                        System.out.print("Nombre: ");
                        nombre = consola.nextLine();
                        System.out.print("Teléfono: ");
                        numeroTelefono = Integer.parseInt(consola.nextLine());
                        System.out.print("Correo electrónico: ");
                        correoElectronico = consola.nextLine();
                        try(BufferedWriter linea = new BufferedWriter(new FileWriter(contacto, true))) {
                            linea.write(nombre + "," + numeroTelefono + "," + correoElectronico);
                            linea.newLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 2:
                        System.out.println("Introduce el nombre que deseas buscar: ");
                        String nombreContacto = consola.nextLine();
                        try(BufferedReader lector = new BufferedReader(new FileReader(contacto))) {
                            String linea;
                            int lineaNumerada = 0;
                            while ((linea = lector.readLine()) != null){
                                System.out.println("En la linea " + (lineaNumerada + 1) + " " + linea.contains(nombreContacto));
                                lineaNumerada ++;
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 3:
                        try (
                                BufferedReader br = new BufferedReader(new FileReader(contacto));
                                BufferedWriter bw = new BufferedWriter(new FileWriter("src/Reto_Semana_6__Viernes_Ejercicio_Integrador_GestorContactos/contactos_mayus.txt"))
                        ) {
                            String linea;
                            while ((linea = br.readLine()) != null) {
                                bw.write(linea.toUpperCase());  // Convierte a mayúsculas
                                bw.newLine();                   // Añade salto de línea
                            }
                            System.out.println("Archivo guardado en mayúsculas correctamente.");
                        } catch (IOException e) {
                            System.out.println("Error al procesar el archivo: " + e.getMessage());
                        }

                        break;
                    case 4:
                        System.out.println("Saliendo del sistema.");
                        exit = true;
                        break;


                }
        }

    }
}
