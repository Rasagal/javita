package Reto_Semana_4_Viernes_Ejercicio_Cajero;

public class TestCajero {
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico(100.0);


        try {
            cajero.retirar(50);
            cajero.retirar(0);
        }catch (MontoInvalidoException | SaldoInsuficienteException e){
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cajero.retirar(80);
        }catch (MontoInvalidoException | SaldoInsuficienteException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
