package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _29_inspecao_final {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de defeitos: ");
        int defeito = sc.nextInt();

        String stat = max(defeito);
        resultado(stat);
        sc.close();
    }
    public static String max(int defeito) {
        String nota;
        if (defeito > 20) {
            nota = "Reprovado";
        } else if (defeito >= 10 && defeito <= 20) {
            nota = "Retrabalho";
        } else if (defeito < 10) {
            nota = "Aprovado";
        } else {
            nota = "Comando invalido";
        }
        return nota;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
