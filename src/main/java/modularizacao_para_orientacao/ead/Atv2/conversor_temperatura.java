package modularizacao_para_orientacao.ead.Atv2;

import java.util.Scanner;

public class conversor_temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        conversao func = new conversao();
        System.out.println("Digite a temperatura que ira converter");
        func.temperatura = sc.nextDouble();
        System.out.println("Digite como deseja converter");
        func.converter = sc.nextLine();
        System.out.println("Conversão: "+func.max());
    }
}
