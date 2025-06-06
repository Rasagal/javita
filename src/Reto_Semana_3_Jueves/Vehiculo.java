package Reto_Semana_3_Jueves;

public abstract class Vehiculo {
    int velocidadMaxima;

    public Vehiculo( int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    abstract void mover();
    void mostrarInfo(){
        System.out.println("El vehiculo va a esta velocidad: ");
    }
    public static void main(String[] args) {
        Vehiculo coche = new Coche(100);
        Vehiculo barco = new Barco(40);

        coche.mostrarInfo();
        coche.mover();

        barco.mostrarInfo();
        barco.mover();

    }
}
 class Coche extends Vehiculo{
     public Coche(int velocidadMaxima){
         super(velocidadMaxima);
     }
    @Override
    void mover() {
        System.out.println("El coche se mueve por carretera");
    }
}
 class Barco extends Vehiculo{
    public Barco(int velocidadMaxima){
        super(velocidadMaxima);
    }
    @Override
    void mover() {
        System.out.println("El barco navega por el mar");
    }
}

