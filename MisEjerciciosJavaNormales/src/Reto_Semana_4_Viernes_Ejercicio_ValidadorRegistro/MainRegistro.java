package Reto_Semana_4_Viernes_Ejercicio_ValidadorRegistro;

import java.util.Scanner;

public class MainRegistro {
    public static void main(String[] args) {
        RegistroUsuario registro = new RegistroUsuario();
        var consola = new Scanner(System.in);


        int anios;

    do {
        System.out.println("Introduce tu edad: ");
        anios = Integer.parseInt(consola.nextLine());
        try{
            registro.registrarEdad(anios);
            break;

        }catch(EdadInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        }
    }while (anios < 18);

    consola.close();
    }
}
