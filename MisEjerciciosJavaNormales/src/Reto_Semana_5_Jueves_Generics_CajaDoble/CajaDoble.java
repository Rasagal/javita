package Reto_Semana_5_Jueves_Generics_CajaDoble;

public class CajaDoble<T, U> {
    private T contenidoT;
    private U contenidoU;


    public CajaDoble(T objetoT, U objetoU) {
        contenidoT = objetoT;
        contenidoU = objetoU;

    }

    public T getPrimero(){
        return contenidoT;
    }
    public U getSegundo(){
        return contenidoU;
    }
    public void mostrarContenido(){
        System.out.print("Mostrando ambos valores: ");
        System.out.println(getPrimero() + " " + getSegundo());
        System.out.print("Mostrando tipo de objeto: ");
        System.out.println(contenidoT.getClass().getName() + contenidoU.getClass().getName());
    }

}
