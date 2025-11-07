package modularizacao_para_orientacao.ead.Atv8;

import java.util.Scanner;

public class calculadora_juros_compostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        juroscompostos func = new juroscompostos();
        System.out.println("Digite a capital inicial");
        func.capital = sc.nextDouble();
        System.out.println("Digite a taxa de juros");
        func.taxa = sc.nextDouble();
        System.out.println("Digite quantos meses");
        func.meses = sc.nextDouble();
        System.out.println(func.max());
    }
}
