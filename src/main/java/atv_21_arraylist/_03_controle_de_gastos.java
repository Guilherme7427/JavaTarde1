package atv_21_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_controle_de_gastos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double compras;
        double soma = 0;
        List<Double> valor = new ArrayList<>();
        do {
            System.out.println("Digite o valor da compra");
            compras = sc.nextDouble();
            valor.add(compras);
        }while(compras != 0);
        for (double valorgasto : valor) {
            soma+=valorgasto;

        }
        double media = soma/valor.size();
        System.out.println("Valor total: "+soma+" Media: "+media);
    }
}
