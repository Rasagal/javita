package Reto_Semana_4_Viernes_Ejercicio_ValidadorRegistro;

public class RegistroUsuario {
    String usuario;
    int edad;


    public void registrarEdad(int edad) throws EdadInvalidaException{

            if (edad < 18){
                throw new EdadInvalidaException("Edad inválida, debes ser mayor de edad");
            }

            this.edad = edad;
        System.out.println("Edad registrada correctamente");
    }
}
