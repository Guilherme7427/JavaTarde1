package modularizacao_na_criacao;

import java.util.Scanner;

public class _09_classificador_de_idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade da pessoa");
        idade = sc.nextInt();

        String sta =max(idade);
        resultado(sta);
        sc.close();
    }

    public static String max(int idade) {
        String categoria;
        if (idade < 0) {
            categoria = "Idade inválida!";
        } else if (idade <= 12) {
            categoria = "Infantil";
        } else if (idade <= 17) {
            categoria = "Adolescente";
        } else if (idade <= 59) {
            categoria = "Adulto";
        } else {
            categoria = "Idoso";
        }

        return "Classificação: " + categoria;
    }

    public static void resultado(String resp) {
        System.out.println(resp);
    }
}

