package Do_While_EAD;

import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Controle de Qualidade por Amostra (Amostragem 10/100)");
        char amostra;
        int A= 0, R= 0;
        for (int i = 1; i<=10; i++) {
            System.out.println("Digite a amostra");
            amostra = sc.next().charAt(0);
            do {
                System.out.println("Digite um valor valido");
                amostra = sc.next().charAt(0);
            } while(amostra != 'A' || amostra!='R');
            if (amostra == 'A') {
                A++;
            }else if (amostra == 'R') {
                R++;
            }
        }
        System.out.println("A: "+A+ " R: "+R);
    }
}
