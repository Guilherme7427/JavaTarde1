package atv_20_for_each;

import java.util.Scanner;

public class _03_precos_e_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int compras;
        System.out.println("Digite quantas compras você fez");
        compras = sc.nextInt();
        Double[] precos = new Double[compras];
        for (int i = 0; i<compras; i++) {
            System.out.println("Digite o preço da compra "+i);
            precos[i] = sc.nextDouble();
            soma+=precos[i];
        }
        for(double zeus : precos) {
            System.out.println("Preços: "+zeus);
        }
        double media = (double) soma/compras;
        System.out.println("Media: "+media);
    }
}
