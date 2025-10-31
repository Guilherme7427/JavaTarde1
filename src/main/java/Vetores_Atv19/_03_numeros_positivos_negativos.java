package Vetores_Atv19;

import java.util.Scanner;

public class _03_numeros_positivos_negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[8];
        for (int i = 0; i<8; i++) {
            System.out.println("Digite um numero positivo ou negativo ");
            numero[i] = sc.nextInt();
        }
        System.out.println("Numeros digitados:");
        for(int i = 0; i<8; i++) {
            if(numero[i] < 0) {
                System.out.println("O numero "+numero[i]+ " é negativo");
            }else {
                System.out.println("O numero "+numero[i]+ " é positivo");
            }
        }
    }
}
