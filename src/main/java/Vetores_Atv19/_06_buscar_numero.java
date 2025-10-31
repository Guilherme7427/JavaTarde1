package Vetores_Atv19;

import java.util.Scanner;

public class _06_buscar_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Qual numero você quer saber se esta no vetor");
        int n1 = sc.nextInt();
        for (int i = 0; i<10; i++) {
            if(n1 == numero[i]) {
                encontrado = true;
                break;
            }
        }
        if (encontrado == true) {
            System.out.println("O numero foi encontrado");
        }else {
            System.out.println("O numero não foi encontrado");
        }
    }
}
