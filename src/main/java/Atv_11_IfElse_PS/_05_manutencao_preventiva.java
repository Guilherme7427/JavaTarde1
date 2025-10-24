package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _05_manutencao_preventiva {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas horas de uso a máquina está ligada ?");
        int horas = sc.nextInt();

        String stat = max(horas);
        sc.close();
    }
    public static String max(int horas) {
        String consumo;
        if (horas < 500) {
            consumo = "O consumo esta baixo";
        }else if (horas > 500 && horas < 1000) {
            consumo = "O consumo esta medio";
        }else if (horas > 1000) {
            consumo = "Desligue a mquina, consumo exagerado!";
        }else {
            consumo = "Erro";
        }
        return consumo;
    }
}
