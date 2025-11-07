package modularizacao_para_orientacao.ead.Atv10;

import java.util.Scanner;

public class conversor_de_moeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        conversormoeda func = new conversormoeda();
        System.out.println("Digite o valor e a moeda (ex: 100 real ou 50 dolar)");
        func.entrada = sc.nextLine();
        System.out.println("Conversão: "+func.converter());
    }
}
