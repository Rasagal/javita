package Reto_Semana_5_Lunes_Set_HashSet_InterseccionConjuntos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterseccionConjuntos {
    public static void main(String[] args) {
        Set<Integer> elementosPrimeros = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> elementosSecundarios = new HashSet<>(List.of(4,5,6,7,8));

        Set<Integer> copiaElementos = new HashSet<>(elementosPrimeros);

        copiaElementos.retainAll(elementosSecundarios);

        System.out.println("Elementos unidos: " + copiaElementos);







    }
}
