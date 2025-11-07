package modularizacao_para_orientacao.ead.Atv6;

import java.util.Scanner;

public class calculadora_de_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculadora_media func = new calculadora_media();
        System.out.println("Digite a quantidade de notas do aluno");
        func.quantidadenotas = sc.nextInt();
        System.out.println("A media de notas de de: "+func.max());
    }
}
