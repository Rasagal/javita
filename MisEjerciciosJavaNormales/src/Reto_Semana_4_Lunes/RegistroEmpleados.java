package Reto_Semana_4_Lunes;

import java.util.Scanner;

public class RegistroEmpleados {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        try {
            System.out.print("Introduce la cantidad de empleados que deseas identificar: ");
            int cantidadEmpleados = Integer.parseInt(consola.nextLine());

            String[] nombreEmpleado = new String[cantidadEmpleados];
            double[] salario = new double[cantidadEmpleados];

            for (int i = 0; i < cantidadEmpleados; i++) {
                System.out.print("Introduce nombre del empleado: ");
                nombreEmpleado[i] = consola.nextLine();

                while (true) {
                    System.out.print("Introduce su salario: ");
                    try {
                        salario[i] = Double.parseDouble(consola.nextLine());
                        if (salario[i] < 0) {
                            System.out.println("Error, el salario no puede ser negativo.");
                            continue;
                        }
                        break; // Salimos del while si todo está correcto
                    } catch (NumberFormatException e) {
                        System.out.println("Error, debes introducir un número válido.");
                    }
                }
            }
            System.out.println("\n--- Lista de empleados registrados ---");
            for (int i = 0; i < cantidadEmpleados; i++) {
                System.out.println("Empleado: " + nombreEmpleado[i] + " | Salario: " + salario[i]);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Error, la cantidad de empleados debe ser un número entero válido.");
        }
        finally{
            consola.close();
            System.out.println("Introducción de datos finalizada.");
        }

    }
}
