package Reto_Semana_3_Martes;

public class Animal {

    //Definimos Metodo
     void hacerSonido(){
        System.out.println("Los animales hacen sonidos");
    }

    static class Perro extends Animal{
        @Override
        void hacerSonido() {
            System.out.println("El perro ladra");
        }
    }
    static class Gato extends Animal{
        @Override
        void hacerSonido() {
            System.out.println("El gato maulla");
        }
    }
    static class Vaca extends Animal{
        @Override
        void hacerSonido() {
            System.out.println("La vaca hace mu!");
        }
    }
    public static void main(String[] args) {
    Animal[] zoo = new Animal[3];
    zoo[0] = new Perro();
    zoo[1] = new Gato();
    zoo[2] = new Vaca();

    for (Animal a : zoo){
        a.hacerSonido();
    }
    }
}
