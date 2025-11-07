package atv_21_arraylist;

import java.util.List;
import java.util.Scanner;

public class _01_lista_numerada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        System.out.println("Digite uma lista de tarefas");
        String tarefas = sc.nextLine();
        List<String> lista = List.of(tarefas.split(","));
        for (String listatarefas : lista) {
            System.out.println(contador + "."+listatarefas);
            contador++;
        }

    }
}