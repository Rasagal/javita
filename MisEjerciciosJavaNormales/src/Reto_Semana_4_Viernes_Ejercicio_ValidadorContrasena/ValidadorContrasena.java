package Reto_Semana_4_Viernes_Ejercicio_ValidadorContrasena;

public class ValidadorContrasena {

    public void validarContrasena(String contrasena) throws ContrasenaInvalidaException {
        boolean tieneNumero = false;
        boolean tieneMayuscula = false;


        for (var i = 0; contrasena.length() > i; i++) {
            char c = contrasena.charAt(i);
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }
            if (Character.isUpperCase(c)){
                tieneMayuscula = true;
            }
        }

        //Lanzar excepción si no cumple los requisitos
        if (contrasena.length() < 8 || !tieneNumero || !tieneMayuscula) {
            throw new ContrasenaInvalidaException("Contraseña inválida: debe tener al menos 8 caracteres, un número y una mayúscula.");
        }

        System.out.println("Contraseña válida.");
    }
}