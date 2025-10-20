package Do_While_EAD;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mistura em Tanque (Tempo Mínimo)");
        int minutos, soma=0;
        char sair = 'n';
        do {
            System.out.println("Digite o tempo que o tanque deve permanecer misturando");
            minutos = sc.nextInt();
            soma+=minutos;
            if (soma>=10) {
                System.out.println("Deseja sair do programa?");
                sair = sc.next().charAt(0);

            }
        }while(sair!='s');
        System.out.println("Mistura encerrada: "+soma);
    }
}
