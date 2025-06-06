package Reto_Semana_3_Miercoles;

public class Transporte {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.conducir();
    }
}

 interface Vehiculo{
    int MAX_VELOCIDAD = 120;
    void conducir();
 }

 class Coche implements Vehiculo{
     @Override
     public void conducir() {
         System.out.println("La velocidad máxima de ese coche es de " + MAX_VELOCIDAD);
     }
 }