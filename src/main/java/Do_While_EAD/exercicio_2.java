package Do_While_EAD;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Produção de Peças até Meta (Célula CNC)");
        /*célula CNC é um sistema automatizado de produção que utiliza
        uma ou mais máquinas com Controle Numérico Computadorizado*/
        int n1, soma=0, ciclo=0;
        char resp;
        do {
            System.out.println("Digite quantas peças foram produzidas");
            n1 = sc.nextInt();
            soma+=n1;
            ciclo++;

        }while (soma<120);
        System.out.println("Total de ciclos: "+ciclo+ " Total de peças: "+soma);
        sc.close();
    }
}
