package atv_20_for_each;

import java.util.Scanner;

public class _04_notas_e_situacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas;
        int quantidadent;
        System.out.println("Digite quantas notas você vai verificar");
        quantidadent = sc.nextInt();
        double[] condicao = new double[quantidadent];
        for (int i = 0; i < quantidadent; i++) {
            System.out.println("Digite as notas dos alunos");
            condicao[i] = sc.nextDouble();
        }
        int aluno = 1;
        for (double zeus : condicao) {
            System.out.println("Nota do aluno " + aluno + " : " + zeus);
            if (zeus >= 60) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            aluno++;
        }
    }
}


