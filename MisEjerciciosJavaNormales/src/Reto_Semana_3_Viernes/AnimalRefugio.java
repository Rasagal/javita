package Reto_Semana_3_Viernes;

public abstract class AnimalRefugio {
    //Definimos parametros de la clase
    String nombre;
    int edad;
    int salud;

    //Definimos Constructor
    AnimalRefugio (String nombre, int edad, int salud){
        this.nombre = nombre;
        this.edad = edad;
        this.salud = salud;
    }

    //Definimos metodo abstracto
    abstract void hacerSonido();

    //Definimos metodo que devuelve un entero
    int alimentar(){
        if (salud < 100) {
            salud = Math.min(100, salud + 10);
        }
        return salud;
    }

    //Definimos metodo que muestra informacion en consola
    void mostrarInfo(){
        System.out.println("Animal: " + nombre + ", " + "Edad: " + edad + ", " + "Salud: " + salud + "%");
    }

    public static void main(String[] args) {
        AnimalRefugio[] animalito = new AnimalRefugio[5];
        animalito[0] = new Perro("Milú", 7, 80);
        animalito[1] = new Gato("Lucy", 15, 75);
        animalito[2] = new Conejo("Pelusa", 5, 100);
        animalito[3] = new Perro("Thor", 6, 85);
        animalito[4] = new Gato("Sia", 6, 98);

        for (AnimalRefugio animal : animalito){
            animal.alimentar();
            animal.mostrarInfo();
            animal.hacerSonido();
            System.out.println();
        }
    }
}
    class Perro extends AnimalRefugio{

    //Llamo al constructor de la clase padre con el super.
    Perro(String nombre, int edad, int salud) {
        super(nombre, edad, salud);
    }

    @Override
    void hacerSonido() {
        System.out.println("El perro hace guau!");
    }
}
    class Gato extends AnimalRefugio{

    //Llamo al constructor de la clase padre con el super.
    Gato(String nombre, int edad, int salud){
        super(nombre, edad, salud);
    }

    @Override
    void hacerSonido() {
        System.out.println("El gato hace miau!");
    }
}
    class Conejo extends AnimalRefugio{

    //Llamo al constructor de la clase padre con el super.
    Conejo(String nombre, int edad, int salud){
        super(nombre, edad, salud);
    }
    
    @Override
    void hacerSonido() {
        System.out.println("El conejo hace Squeak!");
    }
}
