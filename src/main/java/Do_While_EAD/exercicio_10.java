package Do_While_EAD;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("OEE Simplificado");
        //OEE Simplificado é uma versão do indicador de Eficiência Geral do Equipamento
        int ciclos, paradas;
        char sair = 'n';
        int somap = 0, somac = 0;

        do {
            System.out.println("Informe ciclos de produção");
            ciclos = sc.nextInt();
            if (ciclos > 0) {
                somac+=ciclos;
            }else {
                System.out.println("Digite uma opção valida");
            }

            System.out.println("Informe as paradas");
            paradas = sc.nextInt();
            if (paradas >= 0) {
                somap+=paradas;
            }else {
                System.out.println("Digite uma opção valida");
            }

            System.out.println("Deseja parar o programa?");
            sair = sc.next().charAt(0);

        } while (sair != 's');

        double taxa = (double) somac / (somac + somap);
        System.out.println("Disponibilidade: " + taxa + "%");
        sc.close();
    }
}

