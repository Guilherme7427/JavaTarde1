package Do_While_EAD;

import java.util.Scanner;

public class exercicio_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalFalhas = 0;
        int totalPecas = 0;
        double taxaFalhas;

        System.out.println("=== Inspeção por Visão Computacional (Taxa de Falhas) ===");

        do {
            System.out.print("Informe o número de falhas neste ciclo: ");
            int falhas = input.nextInt();

            System.out.print("Informe o número total de peças neste ciclo: ");
            int pecas = input.nextInt();

            totalFalhas += falhas;
            totalPecas += pecas;

            taxaFalhas = ((double) totalFalhas / totalPecas) * 100;
            System.out.printf("Taxa atual de falhas: %.2f%%\n\n", taxaFalhas);

        } while (taxaFalhas > 2.0);

        System.out.println("Taxa final de falhas: " + String.format("%.2f%%", taxaFalhas));
        System.out.println("Inspeção concluída com qualidade aceitável.");

        input.close();
    }
}
