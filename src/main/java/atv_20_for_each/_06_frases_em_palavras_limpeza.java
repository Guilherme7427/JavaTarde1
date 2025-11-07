package atv_20_for_each;

import java.util.Locale;
import java.util.Scanner;

public class _06_frases_em_palavras_limpeza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        String[] palavras = frase.split("\\s+");
        System.out.println("\nPalavras sem pontuação");
        for (String p : palavras) {
            String limpa = p.replaceAll("[.,;!?]", "");
            System.out.println(limpa);

        }
    }
}
