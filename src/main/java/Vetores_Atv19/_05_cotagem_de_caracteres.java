package Vetores_Atv19;

import java.util.Scanner;

public class _05_cotagem_de_caracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] separadordepalavras = new String[5];
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite sua palavra: ");
            separadordepalavras[i] = sc.nextLine();
            if (separadordepalavras[i].length() >= 5){
                contador++;
            }else {
                System.out.println("A sua palavra não tem 5 ou mais caracteres");
            }
        }
        System.out.println("O total de palavra com 5 ou mais caracteres são: " + contador);
    }
}
