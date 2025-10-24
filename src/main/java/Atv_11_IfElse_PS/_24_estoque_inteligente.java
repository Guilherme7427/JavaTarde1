package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _24_estoque_inteligente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade no estoque");
        int estoque = sc.nextInt();

        String stat = max(estoque);
        resultado(stat);
        sc.close();
    }
    public static String max(int estoque) {
        String abastecimento;
        if (estoque <= 10) {
           abastecimento = "Abastecer estoque agora!";
        } else if (estoque >= 10 && estoque <= 30) {
            abastecimento = "Se prepare para abastecer agora!";
        } else if (estoque >= 30) {
            abastecimento = "O estoque está normal!";
        } else {
            abastecimento = "Comando invalido";
        }
        return abastecimento;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
