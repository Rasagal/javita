package Reto_Semana_3_Lunes;

public class Animal {

    //Defino metodo
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

    //Defino clases hija
    static class Perro extends Animal{
        @Override
        public void hacerSonido() {
            System.out.println("El perro hace guau!");
        }
    }
    static class Gato extends Animal{
        @Override
        public void hacerSonido() {
            System.out.println("El gato hace miau");
        }
    }

    public static void main(String[] args) {

        Animal[] animales = new Animal[2];
        animales[0] = new Perro();
        animales[1] = new Gato();
        for (Animal animal : animales){
            animal.hacerSonido();
        }
    }

}
