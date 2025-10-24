package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _10_iot_industrial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo(a) ao sistema de temperatura\n Digite a temperatura que se encontra na maquina");
        int temp = sc.nextInt();

        String stat = max(temp);
        resultado(stat);
        sc.close();
    }
    public static String max(int temp) {
        String alerta;
        if (temp<0) {
            alerta = "Alerta de congelamento";
        }else if (temp >0 && temp <40) {
            alerta = "A teperatura esta normal";
        }else {
            alerta = "ALERTA DE SUPER-AQUECIMENTO";
        }
        return alerta;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}