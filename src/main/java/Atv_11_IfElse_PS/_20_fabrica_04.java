package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _20_fabrica_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o horario atual para saber o turno (00:00)");
        double horario = sc.nextDouble();

        String stat = max(horario);
        resultado(stat);
        sc.close();
    }
    public static String max(double horario) {
        String turno;
        if (horario < 12) {
            turno = "O turno é manhã";
        } else if (horario >= 12 && horario < 18) {
            turno = "O turno é a tarde";
        } else if (horario >= 18 && horario <= 24) {
            turno = "O yurno é noturno";
        } else {
            turno = "Invalido";
        }
        return turno;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
