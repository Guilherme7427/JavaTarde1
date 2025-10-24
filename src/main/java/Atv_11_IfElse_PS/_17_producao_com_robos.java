package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _17_producao_com_robos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja acionar o robo A ?");
        String opcao = sc.nextLine();

        String stat = max(opcao);
        resultado(stat);
        sc.close();
    }
    public static String max(String opcao) {
        if (opcao.equals("sim")) {
            System.out.println("o robo falhou");
            System.out.println("O robo B foi acionado");
        } else {
            System.out.println("Ok");
        } return opcao;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
