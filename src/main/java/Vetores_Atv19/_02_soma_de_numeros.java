package Vetores_Atv19;

import java.util.Scanner;

public class _02_soma_de_numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int[] vect = new int[10];
        for (int i = 0; i<10; i++) {
            System.out.println("Digite um numero "+(i+1));
            vect[i] = sc.nextInt();
            soma += vect[i];
        }
        System.out.println("Os numeros digitados foram: ");
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("A soma dos numeros é: "+soma);
    }
}
