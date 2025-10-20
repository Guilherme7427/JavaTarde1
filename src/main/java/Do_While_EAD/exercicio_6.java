package Do_While_EAD;

import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Checagem de Qualidade (Amostras)");
        String nota;
        int aprovado = 0, reprovado = 0;
        do {
            System.out.println("Digite A para aprovado e R para reprovado e FIM para fechar");
            nota = sc.nextLine().trim().toUpperCase();
            if (nota.equals("A")) {
                System.out.println("Aprovado");
                aprovado++;
            }else if (nota.equals("R")) {
                System.out.println("Reprovado");
                reprovado++;
            }else if (nota.equals("FIM")) {
                System.out.println("Programa finalizado");
            } else {
                System.out.println("Comando invalido. Digite as opções anteriores");
            }

        }while (!nota.equals("FIM"));
        System.out.println("Resultado final:");
        System.out.println("Quantidade de peças aprovados: "+aprovado);
        System.out.println("Quantidade de peças reprovados: "+reprovado);
    }
}
