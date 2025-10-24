package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _18_energia_renovavel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quanto há de energia solar disponivel: ");
        int energia = sc.nextInt();

        String stat = max(energia);
        resultado(stat);
        sc.close();
    }

    public static String max(int energia) {
        String disponivel;
        if (energia > 70) {
            disponivel= "Energia solar disponivel";
        } else if (energia > 30 && energia < 70) {
            disponivel = "Usar energia solar e eletrica";
        }else {
            disponivel = "Usar rede eletrica";
        }
        return disponivel;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
