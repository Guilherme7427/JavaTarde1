package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _13_linha_de_producao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você fez por produção ?");
        int prod = sc.nextInt();

        String stat = max(prod);
        resultado(stat);
        sc.close();
    }
    public static String max(int prod) {
        String eficiencia;
        if (prod<50) {
            eficiencia = "Esta abaixo do desempenho atualmente";
        }else if (prod>50 && prod<100) {
            eficiencia = "O desempenho esta regular";
        }else {
            eficiencia = "O desempenho esta ótimo";
        }
        return eficiencia;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
