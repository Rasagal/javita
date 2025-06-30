package Reto_Semana_2_Miercoles;

public class Rectangulo {
    //Definimos parámetros
    double ancho;
    double alto;

    //Constructor sin parámetros
    public Rectangulo(){
        this.ancho = 1;
        this.alto = 1;
    }
    //Constructor con parámetros
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea(){
        return ancho * alto;
    }
    public void mostrarArea(){
        System.out.println("El resultado del area es de " + calcularArea());
    }

    public static void main(String[] args) {
        var rectangulo1 = new Rectangulo();
        var rectangulo2 = new Rectangulo(5.60, 9.30);

        rectangulo1.mostrarArea();
        rectangulo2.mostrarArea();
    }

}
