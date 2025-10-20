package Do_While_EAD;

import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * RMS (Root Mean Square):
         * Raiz do valor quadrático médio, usada para representar a intensidade
         * média de um sinal de vibração em máquinas, indicando seu nível de energia.
         */

        double leitura;
        int consecutivasBaixas = 0;
        int totalLeituras = 0;

        System.out.println("=== Monitor de Vibração (Predição) ===");
        System.out.println("Digite os níveis RMS de vibração (em g).");

        do {
            System.out.print("Leitura RMS: ");
            leitura = input.nextDouble();
            totalLeituras++;

            if (leitura < 2.5) {
                consecutivasBaixas++;
            } else {
                consecutivasBaixas = 0;
            }

        } while (consecutivasBaixas < 3);

        System.out.println("\nMonitoramento encerrado.");
        System.out.println("Total de leituras realizadas: " + totalLeituras);

        input.close();
    }
}
