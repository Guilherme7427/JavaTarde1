package modularizacao_para_orientacao.ead.Atv9;

import java.util.Scanner;

public class classificador_de_idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        classificaridade func = new classificaridade();
        System.out.println("Digite a idade da pessoa");
        func.idade = sc.nextInt();
        System.out.println(func.max());
    }
}
