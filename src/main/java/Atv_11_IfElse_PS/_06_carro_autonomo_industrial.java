package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _06_carro_autonomo_industrial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciando o sendo... Qual a distância em metros do objeto?");
        int distancia = sc.nextInt();

        String stat = max(distancia);
        resultado(stat);
        sc.close();
    }
    public static String max(int distancia) {
        String aviso;
        if (distancia < 5) {
            aviso = "Freiar";
        }else if (distancia >5 && distancia < 15) {
            aviso = "Reduza a velocidade";
        }else if (distancia > 15) {
            aviso = "pode acelerar";
        }else{
            aviso = "comando invalido";
        }
        return aviso;
    }
    public static void resultado(String resp) {
        System.out.println("Aviso! "+resp);
    }
}
