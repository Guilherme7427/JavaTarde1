package atv_21_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_cadastro_de_nomes_duplicatas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        String saida = "";
        while (!saida.equalsIgnoreCase("FIM")) {
            System.out.println("Digite um nome ou 'FIM' para sair");
            saida = sc.nextLine();
            if (!saida.equalsIgnoreCase("FIM")) {
                lista.add(saida);
            }
        }
        for (String cadastro : lista) {
            System.out.println(cadastro);
        }
    }
}
