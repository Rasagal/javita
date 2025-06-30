package Reto_Semana_5_Jueves_Generics_CajaDoble;

public class MainTest {
    public static void main(String[] args) {
        CajaDoble<String, Integer> primero = new CajaDoble<>("Hola",23);
        CajaDoble<Double, Boolean> segundo = new CajaDoble<>(20.00 , false);

        primero.mostrarContenido();
        segundo.mostrarContenido();

    }
}
