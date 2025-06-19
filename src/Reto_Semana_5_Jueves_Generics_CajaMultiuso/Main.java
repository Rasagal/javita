package Reto_Semana_5_Jueves_Generics_CajaMultiuso;

public class Main {
    public static void main(String[] args) {
        Caja<String> texto = new Caja<>();
        Caja<Integer> numero = new Caja<>();
        Caja<Double> decimal = new Caja<>();

        texto.guardar("Menudo viaje espacial");
        numero.guardar(1993);
        decimal.guardar(20.00);


        texto.mostrarTipo();
        numero.mostrarTipo();
        decimal.mostrarTipo();
    }
}
