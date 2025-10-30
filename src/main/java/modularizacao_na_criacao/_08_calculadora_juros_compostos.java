package modularizacao_na_criacao;

import java.util.Scanner;

public class _08_calculadora_juros_compostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double capital;
        double taxa;
        double meses;
        System.out.println("Digite a capital inicial");
        capital = sc.nextDouble();
        System.out.println("Digite a taxa de juros");
        taxa = sc.nextDouble();
        System.out.println("Digite quantos meses");
        meses = sc.nextDouble();

        String sta = max(capital, taxa, meses);
        resultado(sta);
        sc.close();
    }
    public static String max(double capital, double taxa, double meses) {
        double montante = capital;
        int tempo = 1;
        double taxaDecimal = taxa / 100;
        while (tempo <= meses) {
            montante = montante * (1 + taxaDecimal);
            tempo++;
        }
        double juros = montante - capital;

        return String.format("Montante final: R$ %.2f | Juros: R$ %.2f", montante, juros);
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
