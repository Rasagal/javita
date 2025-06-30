package Reto_Semana_4_Miercoles;

public class CuentaBancaria {
    double saldo;

    public CuentaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

     public void retirar(double monto) throws MontoInvalidoException, SaldoInsuficienteException{
        if (monto <= 0){
            throw new MontoInvalidoException("El monto a retirar debe ser mayor que cero");
        }
        if (monto > saldo){
            throw new SaldoInsuficienteException("No hay suficiente saldo para realizar el retiro");
        }

        saldo -= monto;
         System.out.println("Retiro exitoso. Saldo restante: " + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);

        // Retiro válido
        try {
            cuenta.retirar(500);
        } catch (MontoInvalidoException | SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Monto inválido
        try {
            cuenta.retirar(-100);
        } catch (MontoInvalidoException | SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Saldo insuficiente
        try {
            cuenta.retirar(600);
        } catch (MontoInvalidoException | SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }
}

class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String mensaje){
        super(mensaje);
    }
}

class MontoInvalidoException extends Exception{
    public MontoInvalidoException(String mensaje){
        super(mensaje);
    }
}
