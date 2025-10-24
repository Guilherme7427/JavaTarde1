package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _19_industria_quimica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o PH: ");
        double PHinserido = sc.nextDouble();

        String stat = max(PHinserido);
        resultado(stat);
        sc.close();
    }
    public static String max(double PHinserido) {
        String estado;
        if (PHinserido < 7) {
            estado = "O PH esta acido";
        } else if (PHinserido == 7) {
            estado = "O PH esta neutro";
        } else{
            estado = "O PH esta basico";
        }
        return estado;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
