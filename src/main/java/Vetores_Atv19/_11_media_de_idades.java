package Vetores_Atv19;

import java.util.Scanner;

public class _11_media_de_idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        for (int i = 0; i<5; i++) {
            System.out.println("Digite as idades");
            numeros[i] = sc.nextInt();
            soma+=numeros[i];
        }
        int media = soma/numeros.length;
        System.out.println("A media de idades é: "+media);
    }
}
