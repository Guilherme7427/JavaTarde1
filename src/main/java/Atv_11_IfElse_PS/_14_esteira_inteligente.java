package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _14_esteira_inteligente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para ser colocado na esteira ?");
        int ne = sc.nextInt();

        String stat = max(ne);
        resultado(stat);
        sc.close();
    }
    public static String max(int ne) {
        String esteira;
        if (ne>30) {
            esteira = "Velocidade: lento";
        }else if (ne>30 && ne<60) {
            esteira = "Velocidade: media";
        }else if (ne>60 && ne<90) {
            esteira = "Velocidade: rapido";
        }else {
            esteira = "Velocidade muito alta para ser suportada";
        }
        return esteira;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
