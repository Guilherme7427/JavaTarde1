package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _07_armazen_automatizado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso do pacote: ");
        int peso = sc.nextInt();

        String stat = max(peso);
        resultado(stat);
        sc.close();
    }
    public static String max(int peso) {
        String armazen;
        if (peso<10) {
            armazen = "O pacote esta leve";
        }else if (peso > 10 & peso < 30) {
            armazen = "O pacote esta com peso medio";
        }else if (peso > 30 && peso < 60) {
            armazen = "O pacote esta com peso pesado";
        }else if (peso > 60) {
            armazen = "O pacote esta super pesado";
        }else {
            armazen = "Peso invalido";
        }
        return armazen;
    }
    public static void  resultado(String resp) {
        System.out.println("Armazenando... ");
        System.out.println(resp);
    }
}
