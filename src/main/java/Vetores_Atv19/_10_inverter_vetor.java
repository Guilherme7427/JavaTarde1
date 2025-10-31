package Vetores_Atv19;

import java.util.Scanner;

public class _10_inverter_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.print("Ordem original: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Ordem invertida:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
