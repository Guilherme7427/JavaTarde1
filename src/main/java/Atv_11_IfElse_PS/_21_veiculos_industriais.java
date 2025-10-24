package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _21_veiculos_industriais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a carga do veiculo");
        int carga = sc.nextInt();

        String stat = max(carga);
        resultado(stat);
        sc.close();
    }
    public static String max(int carga) {
        String peso;
        if (carga <= 500) {
            peso = "Quantidade permitida";
        } else if (carga >= 500 && carga <= 1000) {
            peso = "Alerta de peso";
        } else if (carga >= 1000) {
            peso= "Peso proibido";
        } else {
            peso = "Invalido";
        }
        return peso;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
