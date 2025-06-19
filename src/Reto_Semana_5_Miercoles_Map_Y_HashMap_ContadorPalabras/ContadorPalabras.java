package Reto_Semana_5_Miercoles_Map_Y_HashMap_ContadorPalabras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir frase al usuario
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // 2. Dividir en palabras
        String[] palabras = frase.split(" ");

        // 3. Crear el HashMap para contar palabras
        Map<String, Integer> contadorPalabras = new HashMap<>();

        // 4. Recorrer cada palabra
        for (String palabra : palabras) {
            // Normalizamos a minúsculas para contar igual "Hola" y "hola"
            palabra = palabra.toLowerCase();

            // Ignoramos palabras vacías
            if (palabra.isEmpty()) continue;

            if (contadorPalabras.containsKey(palabra)) {
                // Si ya existe, aumentamos el contador
                contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
            } else {
                // Si no existe, la añadimos con valor 1
                contadorPalabras.put(palabra, 1);
            }
        }

        // 5. Mostrar resultados
        System.out.println("\nFrecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : contadorPalabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        scanner.close();
    }
}
