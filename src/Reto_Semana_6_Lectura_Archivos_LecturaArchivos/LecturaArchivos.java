package Reto_Semana_6_Lectura_Archivos_LecturaArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivos {
    public static void main(String[] args) {
        File archivo = new File("src/Reto_Semana_6_Lectura_Archivos_LecturaArchivos/datos.txt");

        if(archivo.exists()){
            System.out.println("✅ El archivo existe.");
            System.out.println("Directorio actual: " + System.getProperty("user.dir"));

            //Leer contenido Linea a Linea
            try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
                String linea;
                while ((linea = lector.readLine()) != null){
                    System.out.println(linea);
                }
            }catch (IOException e){
                System.out.println("❌ Error leyendo el archivo: " + e.getMessage());
            }
        }
        else {
            System.out.println("❌ El archivo no existe.");
        }

    }
}

