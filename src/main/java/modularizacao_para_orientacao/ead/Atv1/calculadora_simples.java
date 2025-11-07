package modularizacao_para_orientacao.ead.Atv1;

import java.util.Scanner;

public class calculadora_simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        contas func = new contas();
        System.out.println("CALCULADORA");
        System.out.println("Digite o primeiro numero");
        func.n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        func.n2 = sc.nextInt();
        System.out.println("Digite a conta que você quer fazer");
        func.opcao = sc.nextLine();
        System.out.println("Resultado: "+func.max());
    }
}
