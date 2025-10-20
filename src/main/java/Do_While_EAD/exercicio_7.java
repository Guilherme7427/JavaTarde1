package Do_While_EAD;

import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Consumo de Energia por Turno");
        int soma = 0;
        int n1;
        int turno = 0;
        double media = 0;
        do {
            System.out.println("Digite o consumo do turno");
            n1 = sc.nextInt();
            soma+=n1;
            turno++;
        }while(n1 != 0);
        media = (double) soma / turno;
        System.out.println("Total: "+soma + " Media: " +media + " os turnos foram: " +turno);
    }
}
