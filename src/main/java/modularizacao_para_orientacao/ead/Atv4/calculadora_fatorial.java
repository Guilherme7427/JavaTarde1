package modularizacao_para_orientacao.ead.Atv4;

import java.util.Scanner;

public class calculadora_fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculadora func = new calculadora();
        System.out.println("Digite o numero para saber o fatorial");
        func.numero = sc.nextInt();
        System.out.println("O fatorial desse numero é: "+func.max());
    }
}
