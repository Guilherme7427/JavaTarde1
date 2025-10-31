package Vetores_Atv19;

import java.util.Scanner;

public class _07_preencher_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[5];
        for (int i = 0; i<5; i++) {
            System.out.println("Digite o numero do vetor");
            numero[i] = sc.nextInt();
        }
        System.out.println("Numeros digitados");
        for(int i = 0; i<5; i++) {
            System.out.println(numero[i]);
        }
    }
}
