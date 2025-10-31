package Vetores_Atv19;

import java.util.Scanner;

public class _08_par_ou_impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        for(int i = 0; i<6; i++) {
            System.out.println("Digite um numero para saber se ele é par ou ímpar");
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2==0) {
                System.out.println("O numero é par");
            } else {
                System.out.println("O numero é ímpar");
            }
        }
    }
}
