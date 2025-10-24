package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _01_robos_autonomos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual direção deseja que o robo ande?");
        String movimento = sc.nextLine();

        String stat = max(movimento);
        result(stat);
        sc.close();
    }

    public static String max(String movimento) {
        if (movimento.equalsIgnoreCase("Direita")) {
            return "O robô se movimentou para a Direita";
        } else if (movimento.equalsIgnoreCase("Esquerda")) {
            return "O robô se movimentou para a esquerda";
        } else if (movimento.equalsIgnoreCase("Frente")) {
            return "O robô se movimentou para Frente";
        } else {
            return "Movimento não reconhecido";
        }
    }

    public static void result(String resp) {
        System.out.println("Resultado: " + resp);
    }
    }

