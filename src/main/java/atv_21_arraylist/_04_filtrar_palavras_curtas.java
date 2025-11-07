package atv_21_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_filtrar_palavras_curtas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> comprimento = new ArrayList<>();
        String palavras;
        int quantidade, tamanho;
        System.out.println("Quantas palavras você quer digitar?");
        quantidade = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            palavras = sc.nextLine();
            if (!palavras.isEmpty()) {
                comprimento.add(palavras);
            } else {
                System.out.println("Palavra inválida! Digite novamente.");
                i--;
            }
        }
        System.out.print("Digite o tamanho mínimo das palavras: ");
        tamanho = sc.nextInt();
        comprimento.removeIf(p -> p.length() < tamanho);
        System.out.println("Palavras que passaram no filtro:");
        for (String p : comprimento) {
            System.out.println(p);
        }
    }
}
