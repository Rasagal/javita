package Cuenta_Bancaria;

public class CuentaBancaria {
    private String titular = "Manolo";
    private double saldo = 8750;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.saldo += cantidad;
        }
    }
    public void retirar(double cantidad){
        if (cantidad < this.saldo){
            this.saldo -= cantidad;
        }
    }
    public void mostrarInformacion(){
        System.out.println(getTitular() + " tiene " + getSaldo());
    }

    public static void main(String[] args) {
        var cuenta1 = new CuentaBancaria();
        cuenta1.mostrarInformacion();
    }
}
