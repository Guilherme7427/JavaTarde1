package Desafios_SENAI;

import java.util.Scanner;

public class Desafio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro de até 7 dígitos: ");
        int n1 = sc.nextInt();

        int original = n1;
        int reverso = 0;
        while (n1 > 0) {
            int digito = n1 % 10;
            reverso = reverso * 10 + digito;
            n1 /= 10;
        }

        if (original == reverso) {
            System.out.println("O número " + original + " é um palíndromo!");
        } else {
            System.out.println("O número " + original + " não é um palíndromo.");
        }

        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();

        boolean ehPalindromo = true;
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo!");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }

        sc.close();

    }
}
