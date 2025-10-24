package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _22_qualidade_do_ar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o indice de particulas presentes no ar");
        int indice = sc.nextInt();

        String stat = max(indice);
        resultado(stat);
        sc.close();
    }
    public static String max(int indice) {
        String qualidade;
        if (indice < 50) {
            qualidade ="O indice está bom";
        } else if (indice >= 50 && indice <= 100) {
            qualidade = "O indice esta medio";
        } else if (indice >= 100 && indice <= 200) {
            qualidade = "O indice esta ruim";
        } else if (indice > 200) {
            qualidade = "O indice esta crtico";
        } else {
            qualidade = "Comando invalido";
        }
        return qualidade;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
