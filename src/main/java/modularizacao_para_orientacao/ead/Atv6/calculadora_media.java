package modularizacao_para_orientacao.ead.Atv6;


import java.util.Scanner;

public class calculadora_media {
    public int quantidadenotas;
    public double nota;

    public String max() {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for(int i = 1; i<quantidadenotas; i++) {
            System.out.println("Digite a nota: "+i);
            nota = sc.nextDouble();
            soma+=nota;
        }
        double media = soma/quantidadenotas;
        return "A media foi de: "+media;
    }
}
