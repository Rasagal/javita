package Reto_Semana_3_Martes;

public class Instrumento {

    void tocar(){

    }
    static class Guitarra extends Instrumento{
        @Override
        void tocar() {
            System.out.println("La guitarra está sonando.");
        }
        void afinarCuerdas(){
            System.out.println("Afinando las cuerdas de la guitarra.");
        }
    }
    static class Piano extends Instrumento{
        @Override
        void tocar() {
            System.out.println("El piano está sonando.");
        }
        void presionarPedal(){
            System.out.println("Se está presionando el pedal del Piano");
        }
    }
    static class Tambor extends Instrumento{
        @Override
        void tocar() {
            System.out.println("El Tambor está sonando.");
        }
    }

    public static void main(String[] args) {
        Instrumento[] instrumento = new Instrumento[3];
        instrumento[0] = new Guitarra();
        instrumento[1] = new Piano();
        instrumento[2] = new Tambor();

        for (Instrumento i : instrumento){
            i.tocar();
            if (i instanceof Guitarra) {
                ((Guitarra) i).afinarCuerdas();
            } else if (i instanceof Piano) {
                ((Piano) i).presionarPedal();
            }
        }


    }
}
