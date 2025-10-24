package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _26_robo_de_pintura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a porcentagem de tinta: ");
        double tinta = sc.nextDouble();

        String stat = max(tinta);
        resultado(stat);
        sc.close();
    }
    public static String max(double tinta) {
        String producao;
        if (tinta <= 15) {
            producao = "Parar a produção";
        } else if (tinta >= 15 && tinta <= 50) {
            producao = "Alerta, reabastecer em breve";
        } else if (tinta >= 50) {
            producao = "Continuar produção";
        } else {
            producao = "Comando invalido";
        }
        return producao;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
