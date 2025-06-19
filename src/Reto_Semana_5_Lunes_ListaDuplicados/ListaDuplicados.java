package Reto_Semana_5_Lunes_ListaDuplicados;

import java.util.HashSet;
import java.util.Scanner;

public class ListaDuplicados {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        HashSet<String> nombres = new HashSet<>();

        System.out.print("Introduce el número exacto de nombres que quieres introducir: ");
        int numeroNombres = Integer.parseInt(consola.nextLine());


        System.out.println("Ahora introduce cada nombre (los duplicados serán ignorados): ");
        //Bucle para introducir la información
        for (var i = 0; i < numeroNombres; i++){
            System.out.print("Nombre " + (i + 1) + ": ");
            String introducirNombre = consola.nextLine();
            nombres.add(introducirNombre);
        }

        //Bucle para unicamente imprimir los nombres de HashSet
        for (String nombre : nombres){
            System.out.println(nombre);
        }
    }
}
