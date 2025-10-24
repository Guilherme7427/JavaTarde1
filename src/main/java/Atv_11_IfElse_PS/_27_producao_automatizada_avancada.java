package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _27_producao_automatizada_avancada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual erro apareceu no sistema agora ?");
        System.out.println("Crítico");
        System.out.println("Moderado");
        String nome = sc.nextLine();

        String stat = max(nome);
        resultado(stat);
        sc.close();
    }

    public static String max(String nome) {
        if (nome.equalsIgnoreCase("Critico")) {
            System.out.println("A linha irá ser parada imediatamente");
        } else if (nome.equalsIgnoreCase("Moderado")) {
            System.out.println("Iremos fazer uma manutenção imediatamente");
        } else {
            System.out.println("A produção irá continuar");
        }
        return nome;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}

