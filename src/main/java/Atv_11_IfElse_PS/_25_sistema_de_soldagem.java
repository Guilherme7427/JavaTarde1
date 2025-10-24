package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _25_sistema_de_soldagem {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da intensidade eletrica: ");
        int intensidade = sc.nextInt();

        String stat = max(intensidade);
        resultado(stat);
        sc.close();
    }
    public static String max(int intensidade) {
        String peso;
        if (intensidade < 100) {
            peso = "A intensidade deve ser maior que 100A";
        } else if (intensidade >= 100 && intensidade <= 200) {
           peso = "A intensidade está mediana";
        } else if (intensidade >= 200) {
            peso = "A intensidade está forte";
        } else {
            peso = "Comando invalido";
        }
        return peso;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
