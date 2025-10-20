package Do_While_EAD;

import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simulação de AGV (Autonomous Guided Vehicle)");
        /*
        é uma representação virtual de como um sistema de Veículos
         Guiados Automatizados irá operar em um ambiente real, como um
          armazém ou fábrica.
         */
        int soma = 0;
        int caixas;
        int viagens = 0;

        do {
            System.out.println("Digite quantas caixas foram entregues");
            caixas = sc.nextInt();
            soma+=caixas;
            viagens++;
        }while (soma<50);
        System.out.println("Viagens: "+viagens+ " Caixas: "+soma);
    }
}
