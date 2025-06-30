package Reto_Semana_6_Escritura_Archivos_EscrituraArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class EscrituraArchivos {
    public static void main(String[] args) {
        File archivo = new File("src/Reto_Semana_6_Escritura_Archivos_EscrituraArchivos/salida.txt");

        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))){
            escritor.write("Probando 1, 2 ,3, agregando primera línea de prueba.");
            escritor.newLine();
            escritor.write("Escribiendo newLine(). se agregan nuevas lineas.");
            escritor.newLine();
            escritor.write("Finaliza la introducción de texto.");
            System.out.println("✅ Archivo escrito correctamente en: " + archivo.getAbsolutePath());
        }catch (IOException e){
            System.out.println("❌ Error al escribir el archivo: " + e.getMessage());
        }
    }
}
