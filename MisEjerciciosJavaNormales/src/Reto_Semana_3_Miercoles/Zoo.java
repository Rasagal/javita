package Reto_Semana_3_Miercoles;

public class Zoo {
    public static void main(String[] args) {
        /*
        Perro perro = new Perro();
        perro.comer();
        perro.dormir();
        */
    Animal[] animalito = new Animal[2];
    animalito[0] = new Perro();
    animalito[1] = new Gato();
    for (int i = 0; i < animalito.length; i++){
        animalito[i].comer();
        animalito[i].dormir();
    }
    }
}
//Defino interface con dos métodos sin cuerpo
interface Animal{
    void comer();
    void dormir();

}
//Creo nueva clase y le implemento la interfaz
class Perro implements Animal{
    @Override
    public void comer() {
        System.out.println("El perro come pienso");
    }

    @Override
    public void dormir() {
        System.out.println("El perro duerme en la cama");
    }
}
class Gato implements Animal{
    @Override
    public void comer() {
        System.out.println("El gato come cuando quiere");
    }

    @Override
    public void dormir() {
        System.out.println("El gato duerme todo el día");
    }
}
