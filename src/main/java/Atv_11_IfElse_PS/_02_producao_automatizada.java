package Atv_11_IfElse_PS;

import java.util.Scanner;

public class _02_producao_automatizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Codigo peça 1 (001)");
        System.out.println("Codigo peça 2 (002)");
        System.out.println("Codigo peça 3 (003)");
        System.out.println("Codigo peça 4 (004)");
        System.out.println("Deseja verificar qual lote ?");
        String texto1 = sc.nextLine();

        String stat = max(texto1);
        result(stat);
        sc.close();
    }

    public static String max(String texto1) {
        if (texto1.equalsIgnoreCase("001")) {
            return "Peça 1 esta em retrabalho";
        } else if (texto1.equalsIgnoreCase("002")) {
            return "Peça 2 esta em analise manual";
        } else if (texto1.equalsIgnoreCase("003")) {
            return "Peça 3 esta aprovada";
        } else if (texto1.equalsIgnoreCase("004")) {
            return "Peça 4 reprovada";
        } else {
            return "Codigo invalido";
        }
    }
    public static void result(String resp) {
        System.out.println("Avaliações: ");
    }
    }

