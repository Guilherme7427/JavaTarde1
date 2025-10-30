package modularizacao_na_criacao;

import java.util.Scanner;

public class _07_verificador_primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Digite um numero");
        n1 = sc.nextInt();

        String sta = max(n1);
        resultado(sta);
        sc.close();
    }
    public static String max(int n1) {
        int divisores = 0;
        String primo;
        for(int i = 1; i<=n1; i++) {
            if(n1 % i == 0) {
                divisores++;
            }
        }
        if(divisores==2) {
            primo = "O numero "+n1+" é primo";
        }else {
            primo = "O numero não é primo";
        }
        return primo;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
