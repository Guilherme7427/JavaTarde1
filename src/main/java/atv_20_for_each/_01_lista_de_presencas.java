package atv_20_for_each;

import java.util.Scanner;

public class _01_lista_de_presencas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomes;
        System.out.println("Digite 3 nomes");
        nomes = sc.nextLine();
        String[] separar = nomes.split(",");
        for(String zeus : separar){
            System.out.println(zeus);
        }
    }
}
