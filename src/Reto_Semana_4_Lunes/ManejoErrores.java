package Reto_Semana_4_Lunes;

import java.util.Scanner;

public class ManejoErrores {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int numerador;
        int denominador;

        try {
            numerador = Integer.parseInt(consola.nextLine());
            denominador = Integer.parseInt(consola.nextLine());
            var resultado = numerador / denominador;
            System.out.println(resultado);
        }
        catch (NumberFormatException e){
            System.out.println("Error debes introducir un número");
            System.out.println("Detalle del error: " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Error no se puede dividir entre cero");
            System.out.println("Detalle del error: " + e.getMessage());
        }
        finally {
            consola.close();
            System.out.println("Finalizando programa");
        }
    }
}
