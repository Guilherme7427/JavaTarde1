package modularizacao_para_orientacao.ead.Atv7;

import java.util.Scanner;

public class verificador_primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        primo func = new primo();
        System.out.println("Digite um numero");
        func.n1 = sc.nextInt();
        System.out.println("Numero primo: "+func.max());
    }
}
