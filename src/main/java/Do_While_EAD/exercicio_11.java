package Do_While_EAD;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Controle de Umidade (Estoque de Matéria Prima)");
        int umidade;
        do {
            System.out.println("Informe a umidade");
            umidade = sc.nextInt();

        }while (umidade<33 || umidade>55);
        System.out.println("Umidade aceita: "+umidade+ "%");
    }
}
