package Clase_Persona;

public class Persona {
    //Atributos privados
    private String nombre;
    private int edad;

    //Creamos los getters y setters para ambos atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Declaramos constructor
    public Persona(String nombre, int edad){
    this.edad = edad;
    this.nombre = nombre;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Ryuji", 17);
        Persona p2 = new Persona("Ann", 17);
        Persona p3 = new Persona("Kojyro", 56);
        System.out.println(p1.getNombre() + " tiene " + p1.getEdad() + " años");
        System.out.println(p2.getNombre() + " tiene " + p2.getEdad() + " años");
        System.out.println(p3.getNombre() + " tiene " + p3.getEdad() + " años");
    }
}
