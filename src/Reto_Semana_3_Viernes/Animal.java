package Reto_Semana_3_Viernes;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    void alimentar(){
        System.out.println("Se acaba de alimentar al " + nombre);
    }
    abstract void hacerSonido();

    void mostrarInfo(){
        System.out.println("Es un " + nombre + " y tiene " + edad + " años.");
    }

    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        animales[0] = new Leon("Leon", 6);
        animales[1] = new Mono("Mono", 3);
        animales[2] = new Elefante("Elefante", 13);

        for (Animal animal : animales){
            animal.mostrarInfo();
            animal.hacerSonido();
            animal.alimentar();
        }
    }


}
    class Leon extends Animal {

        @Override
        void alimentar(){
            System.out.println("Se le alimenta con buena carne");

        }

        Leon(String nombre, int edad){
            super(nombre, edad);
        }

        @Override
        void hacerSonido() {
            System.out.println("El leon ruge");
        }
    }
    class Elefante extends Animal{

        Elefante(String nombre, int edad){
            super(nombre, edad);
        }

        @Override
        void hacerSonido() {
            System.out.println("El elefante barrita");
        }
    }
    class Mono extends Animal{

        Mono(String nombre, int edad){
            super(nombre, edad);
        }

        @Override
        void hacerSonido() {
            System.out.println("El mono grita");
        }
    }
