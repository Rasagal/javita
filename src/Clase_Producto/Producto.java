package Clase_Producto;

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int vender(int cantidad){
        if (cantidad < stock){
            cantidad -= stock;
        }
        return stock;
    }
    public int reponer(int cantidad){
        cantidad += stock;
        return stock;
    }
    public void mostrarProducto(){
        System.out.println(nombre + " cuesta " + precio + " ,stock hay " + stock);
    }

    public static void main(String[] args) {
        var producto1 = new Producto("Patatas", 5.04, 6);
        var producto2 = new Producto("Tomates", 2.21, 12);
        var producto3 = new Producto("Champiñones", 1.25, 8);

        producto1.mostrarProducto();
        producto2.mostrarProducto();
        producto3.mostrarProducto();

    }
}
