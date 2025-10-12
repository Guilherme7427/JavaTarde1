package Desafios_SENAI;

import java.util.Scanner;

public class esafio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos termos você deseja ver da sequencia fimbonacci?");
        int n1 = sc.nextInt();

        int a = 0;
        int b = 1;
        int contador = 0;

        while (contador < n1) {
            System.out.println(a + " ");

            int proximo = a + b;
            a=b;
            b=proximo;
            contador++;
        }
    }
}
