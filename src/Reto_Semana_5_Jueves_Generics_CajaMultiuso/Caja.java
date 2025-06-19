package Reto_Semana_5_Jueves_Generics_CajaMultiuso;

public class Caja <T>{
    private T contenido;

    public void guardar(T objeto){
        contenido = objeto;
    }

    public T obtener(){
        return contenido;
    }

    public void mostrarTipo(){

        System.out.print("Contenido de la caja: ");
        System.out.println(obtener());
        System.out.print("Tipo de objeto: ");
        System.out.println(contenido.getClass().getName());
    }
}
