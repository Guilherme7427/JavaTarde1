package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _23_seguranca_de_rede {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o trafego escaneado");
        int escaneado = sc.nextInt();

        String stat = max(escaneado);
        resultado(stat);
        sc.close();
    }
    public static String max(int escaneado) {
        String trafego;
        if (escaneado > 70) {
            trafego = "O trafego esta bloqueado";
        } else if (escaneado >= 30 && escaneado <= 70) {
            trafego = "O trafego esta suspeito";
        } else if (escaneado < 30) {
            trafego = "O trafego esta normal";
        } else {
            trafego = "Comando invalido";
        }
        return trafego;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
