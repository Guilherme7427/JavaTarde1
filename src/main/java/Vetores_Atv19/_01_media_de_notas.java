package Vetores_Atv19;

import java.util.Scanner;

public class _01_media_de_notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vect = new double[5];
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota do aluno " +(i+1));
            vect[i] = sc.nextDouble();
            soma+=vect[i];
        }
        double media = soma/vect.length;
        System.out.println("Notas dos alunos:");
        for (int i = 1; i < 5; i++) {
            System.out.println("Aluno " +(i+1)+ " : " + vect[i]);
            if(vect[i] >=5) {
                System.out.println("Aprovado");
            }else {
                System.out.println("Reprovado");
            }
        }
        System.out.printf("A media de notas dos alunos é de: %.2f\n", media);
    }
}
