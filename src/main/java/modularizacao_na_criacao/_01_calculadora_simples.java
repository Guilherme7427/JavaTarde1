package modularizacao_na_criacao;

import java.util.Scanner;

public class _01_calculadora_simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char conta;
        System.out.println("CALCULADORA");
        System.out.println("Digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = sc.nextInt();
        System.out.println("Qual conta você deseja fazer");
        conta = sc.next(). charAt(0);

        int sta = max(n1, n2, conta);
        resultado(sta);
        sc.close();
    }
    public static int max(int n1, int n2, char conta) {
        int operacao;
        if (conta == '+') {
            operacao = n1+n2;
        }else if (conta == '-') {
            operacao = n1-n2;
        }else if (conta == '*') {
            operacao = n1*n2;
        }else {
            operacao = n1/n2;
        }
        return operacao;
    }
    public static void resultado(int resp) {
        System.out.print(resp);
    }
}

