package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _12_seguranca_industrial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Você está com o crachá? (sim/não)");
        String autorizacao = sc.nextLine();

        String stat = max(autorizacao, sc);
        resultado(stat);
        sc.close();
    }
    public static String max(String autorizacao, Scanner sc) {
        String aprovado;

        if (autorizacao.equalsIgnoreCase("sim")) {
            System.out.println("Você está com o capacete? (sim/não)");
            String confirmacao2 = sc.nextLine();
            if (confirmacao2.equalsIgnoreCase("sim")) {
                System.out.println("Está dentro do horário do seu turno? (sim/não)");
                String confirmacao3 = sc.nextLine();
                if (confirmacao3.equalsIgnoreCase("sim")) {
                    aprovado = "Tudo certo então!  Prossiga para sua área. Ótimo trabalho!";
                } else {
                    aprovado = " Lamentamos, mas não podemos permitir seu acesso. Fora do horário de turno.";
                }
            } else {
                aprovado = " Acesso negado: É necessário o uso de capacete.";
            }
        } else {
            aprovado = "Acesso negado: É necessário portar o crachá.";
        }
        return aprovado;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}

