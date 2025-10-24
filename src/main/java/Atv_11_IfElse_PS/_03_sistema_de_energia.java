package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _03_sistema_de_energia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quala porcentagem da energia da maquina ?");
        int energia = sc.nextInt();
        String maquina = max(energia);
        result(maquina);
        sc.close();
    }
    public static String max(int energia) {
        String msg;
        if (energia < 70 && energia > 30) {
            msg = "Está em modo normal";
        } else if (energia > 70 && energia < 100) {
            msg = "Entrando em modo turbo";
        } else {
            msg = "Digite algo certo";
        }return msg;
    }
    public static void result(String resp) {
        System.out.println("Resultado: " + resp);
    }
}
