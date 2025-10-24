package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _30_datacenter_industrial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        float temperatura = sc.nextFloat();

        String stat = max(temperatura);
        resultado(stat);
        sc.close();
    }
    public static String max(float temperatura) {
        String aviso;
        if (temperatura >= 80) {
            aviso = "Desligue os servidores";
        } else if (temperatura >= 60 && temperatura <= 80) {
            aviso = "Resfriamente extra";
        } else if (temperatura <= 60) {
            aviso = "Temperatura estavel";
        } else {
            aviso = "Comando invalido";
        }
        return aviso;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
