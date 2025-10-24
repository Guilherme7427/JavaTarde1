package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _16_inspecao_automatizada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Como está o defeito da peça ?");
        System.out.println("Vísivel");
        System.out.println("Microscopico");
        System.out.println("Ausente");
        String defeito = sc.nextLine();

        String stat = max(defeito);
        resultado(stat);
        sc.close();
    }

    public static String max(String defeito) {
        if (defeito.equalsIgnoreCase("Visivel")) {
            System.out.println("A peça está defeituosa, deve voltar para a produção");
        } else if (defeito.equalsIgnoreCase("Microscopic")) {
            System.out.println("A peça está com um defeito médio, revise antes de mandar");
        } else if (defeito.equalsIgnoreCase("Ausente")) {
            System.out.println("A peça está com qualidade boa/ótima, pode mandar para o estoque");
        } else {

            System.out.println("Digite as condições válidas");
        }
        return defeito;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
