package Reto_Semana_5_Miercoles_Map_Y_HashMap_DiccionarioCapitales;

import java.util.HashMap;
import java.util.Scanner;

public class DiccionarioCapitales {
    public static void main(String[] args) {
        HashMap<String, String> paisesCapitales = new HashMap<>(5);
        var consola = new Scanner(System.in);
        String pais;
        String capital;

        System.out.println("Introduce 5 países y sus respectivas capitales. ");
        for (var i = 0; i < 5; i++){
            System.out.print("Introduce país: ");
            pais = consola.nextLine();
            System.out.print("Introduce capital: ");
            capital = consola.nextLine();
            paisesCapitales.put(pais, capital);
        }

        for (String key : paisesCapitales.keySet()){
            System.out.println(key + " -> " + paisesCapitales.get(key));
        }
    }
}
