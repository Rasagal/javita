package Reto_Semana_3_Martes;

import java.util.Scanner;

public class Figura {
    static Scanner consola = new Scanner(System.in);

    double calcularArea(){
        return 0;
    }

    static class Rectangulo extends Figura{
        @Override
        double calcularArea() {
            System.out.print("Introduce area: ");
            double area = Double.parseDouble(consola.nextLine());
            System.out.print("Introduce la altura: ");
            double altura = Double.parseDouble(consola.nextLine());
            return area * altura;
        }
    }
    static class Circulo extends Figura{
        @Override
        double calcularArea() {
            System.out.print("Introduce el radio del círculo: ");
            double radio = Double.parseDouble(consola.nextLine());
            return 3.14 * (radio * radio);
        }
    }

    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];
        figuras[0] = new Rectangulo();
        figuras[1] = new Circulo();

        for (Figura f : figuras){
            double area = f.calcularArea();
            System.out.println("Area calculada: " + area);
        }
    }
}
