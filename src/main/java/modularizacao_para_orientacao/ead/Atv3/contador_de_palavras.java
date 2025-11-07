package modularizacao_para_orientacao.ead.Atv3;

import java.util.Scanner;

public class contador_de_palavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        contar func = new contar();
        System.out.println("Digite uma frase ou aperte ENTER para sair");
        func.frase = sc.nextLine();
        System.out.println("Contador de palavras: "+func.max());
    }
}
