package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _09_producao_inteligente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Vamos conferir o estado do lote, ele passou na verificação de integridade?");
        String texto1 = sc.nextLine();
        if (texto1.equalsIgnoreCase("sim")) {
            System.out.println("Certo, quer conferir se está adequado para a transferencia ?");
            String texto2 = sc.nextLine();
            if (texto2.equalsIgnoreCase("sim")) {
                System.out.println("Certo, digite a % de estado em que ela se encontra");
                int estado = sc.nextInt();
                String stat = max(estado);
                resultado(stat);
                sc.close();
            }
        }else {
            System.out.println("Ok");
        }


    }

    public static String max(int estado) {
        String conferir;
        if (estado>=10) {
            conferir = "ACIONANDO ALERTA DE DEFEITO!";
        } else {
            conferir = "Lote aprovado";
        }
        return conferir;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}