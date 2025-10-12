package Desafios_SENAI;

import java.util.Scanner;

public class Desafio_4 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Digite o valor a ser sacado: ");
        int n1 = Sc.nextInt();

        if (n1 <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        int cedula50 = 0, cedula10 = 0, cedula2 = 0;

        if (n1 >= 50) {
            cedula50 = n1 / 50;
            n1 = n1 % 50;
        }

        if (n1 >= 10) {
            cedula10 = n1 / 10;
            n1 = n1 % 10;
        }

        if (n1 >= 2) {
            cedula2 = n1 / 2;
            n1 = n1 % 2;
        }

        if (n1 != 0) {
            System.out.println("Valor não pode ser sacado com as cédulas disponíveis (50, 10, 2).");
        } else {
            System.out.println("Distribuição de cédulas:");
            if (cedula50 > 0) System.out.println("R$50: " + cedula50 + " cédula(s)");
            if (cedula10 > 0) System.out.println("R$10: " + cedula10 + " cédula(s)");
            if (cedula2 > 0) System.out.println("R$2: " + cedula2 + " cédula(s)");
        }

    }
}
