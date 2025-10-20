package Do_While_EAD;

import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * AS/RS (Automated Storage and Retrieval System):
         * Sistema automatizado de armazenagem e recuperação de materiais,
         * utilizado na Indústria 4.0 para otimizar a gestão de estoques e inventários.
         */

        System.out.println("=== Inventário Cíclico (AS/RS) ===");
        System.out.print("Informe o número total de prateleiras: ");
        int totalPrateleiras = input.nextInt();

        int prateleirasValidadas = 0;

        do {
            System.out.print("Leia a etiqueta da prateleira " + (prateleirasValidadas + 1) + ": ");
            String etiqueta = input.next(); // leitura simbólica da etiqueta
            System.out.println("Prateleira validada: " + etiqueta);
            prateleirasValidadas++;
        } while (prateleirasValidadas < totalPrateleiras);

        System.out.println("\nInventário concluído.");

        input.close();
    }
}
