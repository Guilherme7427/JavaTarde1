package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _04_controle_de_acesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Qual seu tipo de acesso ?");
        System.out.println("Básico");
        System.out.println("Supervisor");
        System.out.println("Engenheiro");
        String acesso = sc.nextLine();
        String stat = max(acesso);
        System.out.println(stat);
        sc.close();
    }

    public static String max(String acesso) {
        String msgm;
        if (acesso.equalsIgnoreCase("basico")) {
            msgm = "Acesso negado";
        } else if (acesso.equalsIgnoreCase("supervisor")) {
            msgm = "Acesso parcial concedido ao sistema";
        } else if (acesso.equalsIgnoreCase("engenheiro")) {
            msgm = "Acesso total";
        } else {
            msgm = "Comando invalido";
        }
        return msgm;
    }
}
