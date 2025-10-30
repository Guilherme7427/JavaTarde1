package modularizacao_na_criacao;

import java.util.Scanner;

public class _06_calculadora_de_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadenotas;
        System.out.println("Digite a quantidade de notas do aluno");
        quantidadenotas = sc.nextInt();

        String sta = max(quantidadenotas, sc);
        resultado(sta);
        sc.close();
    }
    public static String max(int quantidadenotas, Scanner sc) {
        double soma = 0;
        for(int i = 1; i<quantidadenotas; i++) {
            System.out.println("Digite a nota: "+i);
            double nota = sc.nextDouble();
            soma+=nota;
        }
        double media = soma/quantidadenotas;
        return "A media foi de: "+media;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }

}
