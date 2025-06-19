package Reto_Semana_5_Lunes_Set_HashSet_ComprobacionExistencia;

import java.util.HashSet;
import java.util.Scanner;

public class ComprobacionExistencia {
    public static void main(String[] args) {
        HashSet<String> palabras = new HashSet<>();
        palabras.add("malo");
        palabras.add("feo");
        palabras.add("prohibido");
        var consola = new Scanner(System.in);

        System.out.print("Escribe una frase completa: ");
        String frase = consola.nextLine();

        //Dividimos la frase en palabras
        String[] palabrasSueltas = frase.split(" ");

        boolean contieneProhibidas = false;

        for (String palabra : palabrasSueltas){
            if (palabras.contains(palabra.toLowerCase())){
                System.out.println("La frase contiene una palabra prohibida: " + palabra);
                contieneProhibidas = true;
            }
        }

        if (!contieneProhibidas){
            System.out.println("La frase no contiene palabras prohibidas");
        }
        consola.close();
    }
}
