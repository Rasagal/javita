package Reto_Semana_3_Jueves;

public abstract class Animal {
    abstract void hacerSonido();
     void respirar(){
         System.out.println("El animal hace ruidos");
     }

    public static void main(String[] args) {
         Animal animalEjemplo = new Leon();
         animalEjemplo.hacerSonido();
         animalEjemplo.respirar();

    }
}

 class Leon extends Animal{

     @Override
     void hacerSonido() {
         System.out.println("El Leon ruge");
     }
 }
