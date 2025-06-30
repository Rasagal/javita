package Reto_Semana_6_Clases_File_AnalizadorTexto;

import java.io.*;

public class AnalizadorTexto {
    public static void main(String[] args) {
        //Se crea el fichero en caso de no existir.
        File fichero = new File("src/Reto_Semana_6_Clases_File_AnalizadorTexto/datos.txt");

        //Comprobación del archivo existente o no.
        if (fichero.exists()){
            System.out.println("El archivo existe.");
        }
        else{
            System.out.println("El archivo no existe.");
        }

        //Mostrar datos del fichero.
        System.out.println("Nombre del fichero: " + fichero.getName());
        System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
        System.out.println("Tamaño del archivo: " + fichero.length() + " bytes");

        //Escribir contenido dentro del archivo llamado datos.
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero))){
            escritor.write("Juan");
            escritor.newLine();
            escritor.write("Maria");
            escritor.newLine();
            escritor.write("Pedro");
            escritor.newLine();
            escritor.write("Ana");
            escritor.newLine();
            escritor.write("Carlos");
            System.out.println("✅ Archivo escrito correctamente en: " + fichero.getAbsolutePath());
        }catch (IOException e){
            System.out.println("❌ Error al escribir el archivo: " + e.getMessage());
        }

        //Leer linea a linea el archivo entero.
        try(BufferedReader lector = new BufferedReader(new FileReader(fichero))){

            //Comprobación de número total de lineas y lineas que contienen la letra "a" o "A".
            String linea;
            int totalLineas = 0;
            int lineasConA = 0;

            while ((linea = lector.readLine()) != null){
                System.out.println("📝 " + linea);
                totalLineas++;
                if (linea.toLowerCase().contains("a")) {
                    lineasConA++;
                }
            }

            System.out.println("\n📌 Total de líneas: " + totalLineas);
            System.out.println("🔎 Líneas que contienen la letra 'a' o 'A': " + lineasConA);

        }catch (IOException e){
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }
    }
}
