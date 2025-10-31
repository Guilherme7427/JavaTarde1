package Vetores_Atv19;

import java.util.Scanner;

public class _09_numeros_divisiveis_por_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite seu numero");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 3 == 0) {
                System.out.println("O numero é divisivel por 3");
                soma++;
            } else {
                System.out.println("O numero não é divisivel por 3");
            }
        }
        System.out.println("Divisiveis por 3: "+soma);
    }
}


