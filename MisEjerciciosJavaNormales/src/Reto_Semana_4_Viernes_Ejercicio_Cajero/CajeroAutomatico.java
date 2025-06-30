package Reto_Semana_4_Viernes_Ejercicio_Cajero;

public class CajeroAutomatico {
    private double saldo;

    public CajeroAutomatico(double saldoInicial){
        this.saldo = saldoInicial;
    }
    public void retirar (double monto) throws MontoInvalidoException, SaldoInsuficienteException {
        if (monto <= 0){
            throw new MontoInvalidoException("Numero introducido inválido");
        }
        if (monto > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente en la cuenta");
        }
        saldo = saldo - monto;
        System.out.println("Retiro exitoso. Saldo restante: " + saldo);
    }
}
//Lanzamos esta si el monto es menor o igual a 0
class MontoInvalidoException extends Exception{
    public MontoInvalidoException(String mensaje){
        super(mensaje);
    }
}
//Lanzamos esta si el saldo es insuficiente
class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
