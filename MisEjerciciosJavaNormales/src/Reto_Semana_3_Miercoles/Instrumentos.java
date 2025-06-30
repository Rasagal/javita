package Reto_Semana_3_Miercoles;

public class Instrumentos {
    public static void main(String[] args) {
        Artista artista = new Artista();
        artista.tocarInstrumento();
        artista.cantar();
    }


}
//Defino dos Interface sin cuerpo en ambos métodos.
interface Musico{
    void tocarInstrumento();
}
interface Cantante{
    void cantar();
}

//Declaro una nueva clase con dos Interfaces "Musico y Cantante".
class Artista implements Musico,Cantante{
    @Override
    public void tocarInstrumento() {
        System.out.println("El instrumento hace tilin tilin");
    }

    @Override
    public void cantar() {
        System.out.println("El cantante hace lere lereeee");
    }
}


