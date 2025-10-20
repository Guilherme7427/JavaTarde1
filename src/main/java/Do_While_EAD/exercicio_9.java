package Do_While_EAD;

import java.util.Random;
import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String resp;
        char resp01;
        int tentativasA = 0, tentativasR = 0;

        do {
            System.out.println("Deseja começar o teste (s/n)?");
            resp01 = sc.next().charAt(0);
            boolean teste01 = false;
            if (resp01 == 's') {
                String teste = rand.nextBoolean() ? "A" : "R";
                if (teste.equalsIgnoreCase("A")){
                    System.out.println("Sua peça foi APROVADA");
                    tentativasA++;
                } else {
                    System.out.println("Sua peça foi REPROVADA");
                    tentativasR++;
                }

            }else{
                System.out.println("Digite uma opção válida");
                return;
            }
            System.out.println("Deseja continuar tentando (s/n) ?");
            resp01 = sc.next().charAt(0);
        }while (resp01 != 'n');
        System.out.println("Sistema encerrado");
        System.out.println("Total de APROVADOS: " +tentativasA);
        System.out.println("Total de REPROVADOS: " +tentativasR);
    }
}