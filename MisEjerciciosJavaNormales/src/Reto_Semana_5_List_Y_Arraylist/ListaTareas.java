package Reto_Semana_5_List_Y_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTareas{
    List<String> tareas = new ArrayList<>();
    Scanner consola = new Scanner(System.in);

    public void agregarTarea (){
        System.out.print("Introduce el número exacto de tareas que desea agregar: ");
        int numeroTareas = Integer.parseInt(consola.nextLine());

        System.out.print("Introduce las " + numeroTareas + " que quieres agregar: ");
        for (int i = 0 ; i < numeroTareas ; i++){
            String tarea = consola.nextLine();
            tareas.add(tarea);
        }
    }

    public void mostrarTareas (){
        for (var i = 0 ; i < tareas.size(); i++){
            System.out.println((i + 1) + " " + tareas.get(i));
        }
    }

    public void eliminarTarea(){

        System.out.print("Agregue el numero de la tarea que desea eliminar: ");
        int indice = Integer.parseInt(consola.nextLine());

        if (indice >= 1 && indice <= tareas.size()){
            tareas.remove(indice - 1);
            System.out.println("Tarea eliminada.");
        }else {
            System.out.println("Índice inválido.");
        }
        mostrarTareas();
    }
}
