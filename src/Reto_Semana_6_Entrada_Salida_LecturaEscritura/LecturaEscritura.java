package Reto_Semana_6_Entrada_Salida_LecturaEscritura;

import java.io.*;

public class LecturaEscritura {
    public static void main(String[] args) {
        //Creo el archivo con extension .txt
        File archivo = new File("src/Reto_Semana_6_Entrada_Salida_LecturaEscritura/entrada.txt");

        try {
            //Forma correcta de escribir en un archivo linea por linea
            FileWriter escritorCaracter = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(escritorCaracter);

            escritor.write("Hola, este es un archivo de prueba.");
            escritor.newLine();
            escritor.write("Vamos a practicar lectura y escritura en Java.");
            escritor.newLine();
            escritor.write("Comprobando ultima linea.");

            //Cerrar el escritor antes de comenzar a leer el archivo
            escritor.close();

            //Ahora funciona correctamente el lector linea por linea
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            int contadorLineas = 0;
            while ((linea = lector.readLine()) != null){
                System.out.println(linea);
                contadorLineas++;
            }
            System.out.println("Total de lineas: " + contadorLineas);

            //Cerrar lector
            lector.close();

            //Segunda lectura y escritura en mayúsculas
            BufferedReader lector2 = new BufferedReader(new FileReader(archivo));
            BufferedWriter escritorMayus = new BufferedWriter(new FileWriter("src/Reto_Semana_6_Entrada_Salida_LecturaEscritura/salida.txt"));

            String linea2;
            while ((linea2 = lector2.readLine()) != null){
                escritorMayus.write(linea2.toUpperCase());
                escritorMayus.newLine();
                System.out.println(linea2.toUpperCase());
            }

            //Cerrar ambos
            lector2.close();
            escritorMayus.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
