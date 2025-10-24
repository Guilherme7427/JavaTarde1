package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _11_drones_da_industria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nivel da bateria que se encontra ?");
        int bat = sc.nextInt();

        String stat = max(bat);
        resultado(stat);
        sc.close();
    }
    public static String max(int bat) {
        String bateria;
        if (bat<20) {
            bateria = "Retorne imediatamente";
        }else if (bat > 20 && bat< 60) {
            bateria = "Rota muito curta";
        }else {
            bateria = "Rota longa";
        }
        return bateria;
    }
    public static void resultado(String resp){
        System.out.println(resp);
    }
}
