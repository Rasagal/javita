package Reto_Semana_2_Miercoles;

public class Libro {
    //Parámetros definidos al comienzo de la clase
    String titulo;
    String autor;
    int anioPublicacion;

    //Constructor sin parámetros definidos
    public Libro(){
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.anioPublicacion = 0;
    }

    //Constructor con solo DOS parámetros definidos
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    //Constructor con todos los parámetros definidos
    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }




    public void mostrarInfo(){
        System.out.println("El título del libro es " + titulo + " del autor "
                + autor + " y se publicó en " + anioPublicacion);

    }

    public static void main(String[] args) {
        var libro1 = new Libro();
        var libro2 = new Libro("Jayne Eyre", "Charlotte Bronté");
        var libro3 = new Libro("El viaje de Doble-P", "Fernando Lalana", 2002);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();

    }
}
