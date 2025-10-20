package Do_While_EAD;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu do painel MES");
        /*
        é uma tela de controle digital, geralmente um dashboard,
        que apresenta dados e indicadores de desempenho em
        tempo real da produção industrial.
         */
        int n1 ;

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        do {
            System.out.println("1_Registre a parada");
            System.out.println("2_Registre a Produção");
            System.out.println("3_Sair");
            n1 = sc.nextInt();
            if (n1 == 1) {
                System.out.println("Parada registrada");
            }else if (n1 == 2) {
                System.out.println("Produção registrada");
            } else if (n1 == 3) {
                System.out.println("Fechar menu");
            } else {
                System.out.println("Opção invalida");
            }
        }while (n1!=3);
    }
}
