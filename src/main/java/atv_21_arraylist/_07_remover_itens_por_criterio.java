package atv_21_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07_remover_itens_por_criterio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavras;
        int tamanho;
        System.out.println("Digite suas palavras");
        palavras = sc.nextLine();
        System.out.println("Digite um tamanho minimo para as palavras");
        tamanho = sc.nextInt();
        List<String> comprimento = List.of(("\\s+"));
        comprimento.add(palavras);
        comprimento.removeIf(p -> palavras.length() < tamanho);
        for (String filtro : comprimento) {
            if(filtro.length() < tamanho) {
                System.out.println(filtro);
            } else {
                System.out.println(filtro);
            }
        }
    }
}
