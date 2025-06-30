package Reto_Semana_3_Jueves;

public abstract class Empleado {
    String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();
    void mostrarDatos(){
        System.out.println(nombre + calcularSalario());
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Gerente("An a", 2000);
        Empleado empleado2 = new Desarrollador("Manolo ", 1300);

        empleado1.calcularSalario();
        empleado1.mostrarDatos();
        empleado2.calcularSalario();
        empleado2.mostrarDatos();
    }
}

class Gerente extends Empleado{
    public Gerente (String nombre, double salarioBase){
        super(nombre, salarioBase);
    }

    @Override
    double calcularSalario() {
        return salarioBase + 1000;
    }
}
class Desarrollador extends Empleado{
    public Desarrollador(String nombre, double salarioBase){
        super(nombre, salarioBase);
    }

    @Override
    double calcularSalario() {
        double productividad = salarioBase * 0.1;
        return salarioBase + productividad;
    }
}