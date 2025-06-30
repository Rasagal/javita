package Reto_Semana_3_Martes;

public class Vehiculo {

    //Defino Metodo
    void mover(){
        System.out.println("El vehículo se está moviendo.");
    }

    //Defino clases hija
    static class Coche extends Vehiculo{
        @Override
        void mover() {
            System.out.println("El coche hace niunnnn");
        }
    }
    static class Bicicleta extends Vehiculo{
        @Override
        void mover() {
            System.out.println("La bicicleta hace fiuuuuun");
        }
    }

    public static void main(String[] args) {
        Vehiculo[] transporte = new Vehiculo[2];
        transporte[0] = new Coche();
        transporte[1] = new Bicicleta();

        for (Vehiculo t : transporte){
            t.mover();
        }
    }
}
