package Desafios_SENAI;

import java.util.Scanner;

public class Desafio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 399: ");
        int n1 = sc.nextInt();

        if (n1 < 1 || n1 > 399) {
            System.out.println("Número fora do limite permitido (1 a 399).");
            return;
        }

        System.out.print("Número Romano: ");

        while (n1 >= 100) {
            System.out.print("C");
            n1 -= 100;
        }

        if (n1 >= 90) {
            System.out.print("XC");
            n1 -= 90;
        } else if (n1 >= 50) {
            System.out.print("L");
            n1 -= 50;
            while (n1 >= 10) {
                System.out.print("X");
                n1 -= 10;
            }
        } else if (n1 >= 40) {
            System.out.print("XL");
            n1 -= 40;
        } else {
            while (n1 >= 10) {
                System.out.print("X");
                n1 -= 10;
            }
        }

        if (n1 == 9) {
            System.out.print("IX");
            n1 -= 9;
        } else if (n1 >= 5) {
            System.out.print("V");
            n1 -= 5;
            while (n1 >= 1) {
                System.out.print("I");
                n1 -= 1;
            }
        } else if (n1 == 4) {
            System.out.print("IV");
            n1 -= 4;
        } else {
            while (n1 >= 1) {
                System.out.print("I");
                n1 -= 1;
            }
        }

    }
}
