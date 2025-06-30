package Reto_Semana_2_Miercoles;

public class Coche {
    //Definimos parámetros fuera de los constructores pero propios de la clase
    String marca;
    String modelo;
    int epoca;

    //Constructor por defecto
    public Coche() {
        this.marca = marca;
        this.modelo = modelo;
        this.epoca = epoca;
    }
    public Coche(String marca, String modelo, int epoca){
        this.marca = marca;
        this.modelo = modelo;
        this.epoca = epoca;
    }

    public void mostrarDetalles(){
        System.out.println("La marca del coche es " + marca + " el modelo es " +
                modelo + " y es del año " + epoca);
    }

    public static void main(String[] args) {
        var coche1 = new Coche("Renault Mégane", "Sedan", 2002);
        coche1.mostrarDetalles();

    }

}
