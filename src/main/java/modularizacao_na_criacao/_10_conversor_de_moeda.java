package modularizacao_na_criacao;

import java.util.Scanner;

public class _10_conversor_de_moeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;

        System.out.println("Digite o valor e a moeda (ex: 100 real ou 50 dolar)");
        entrada = sc.nextLine();

        String sta = converter(entrada);
        resultado(sta);
        sc.close();
    }

    public static String converter(String entrada) {
        String[] partes = entrada.split(" ");

        if (partes.length < 2) {
            return "Formato inválido! Use: valor moeda (ex: 100 real)";
        }

        double valor = Double.parseDouble(partes[0]);
        String moeda = partes[1].toLowerCase();
        double resultado;
        String resposta;

        if (moeda.equals("real") || moeda.equals("reais")) {
            resultado = valor / 5.50;
            resposta = "R$ " + valor + " = US$ " + resultado;

        } else if (moeda.equals("dolar") || moeda.equals("dolares")) {
            resultado = valor * 5.50;
            resposta = "US$ " + valor + " = R$ " + resultado;

        } else if (moeda.equals("euro") || moeda.equals("euros")) {
            resultado = valor * 6.00;
            resposta = "€ " + valor + " = R$ " + resultado;

        } else {
            resposta = "Moeda não suportada! Use: real, dolar ou euro";
        }

        return resposta;
    }

    public static void resultado(String resp) {
        System.out.println(resp);
    }
}


