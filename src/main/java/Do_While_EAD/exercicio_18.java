package Do_While_EAD;

import java.util.Scanner;

public class exercicio_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * Takt Time = ritmo de produção necessário para atender à demanda do cliente.
         * É calculado normalmente como:
         *   Takt Time = Tempo disponível de produção / Demanda do cliente
         * No contexto deste programa, a média dos tempos por estação deve ficar
         * menor ou igual ao takt, indicando que a linha está balanceada.
         */

        double takt;
        double somaTempos = 0;
        int qtdEstacoes = 0;
        double media = 0;

        System.out.println("=== Balanceamento de Linha (Takt Time) ===");
        System.out.print("Informe o Takt Time desejado: ");
        takt = input.nextDouble();

        do {
            System.out.print("Tempo da estação " + (qtdEstacoes + 1) + ": ");
            double tempo = input.nextDouble();

            somaTempos += tempo;
            qtdEstacoes++;
            media = somaTempos / qtdEstacoes;

        } while (media > takt);

        System.out.println("\nBalanceamento concluído.");
        System.out.printf("Média dos tempos: %.2f\n", media);
        System.out.println("Quantidade de estações: " + qtdEstacoes);

        input.close();
    }
}
