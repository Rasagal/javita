package Reto_Semana_4_Viernes_Ejercicio_ValidadorContrasena;

import java.util.Scanner;

public class MainContrasena {
    public static void main(String[] args) {
        ValidadorContrasena validador = new ValidadorContrasena();
        var consola = new Scanner(System.in);
        String contrasena;
        System.out.print("Introduce Contraseña: ");


        try {
            contrasena = consola.nextLine();
            validador.validarContrasena(contrasena);
            System.out.println("Contraseña registrada con éxito.");



        }catch (ContrasenaInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        }
        consola.close();
    }
}
