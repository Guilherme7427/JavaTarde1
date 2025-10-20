package Do_While_EAD;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conferência de Paletes (WMS)");
        /*
        Warehouse Management System (Sistema de Gerenciamento de Armazém),
         um software que gerencia e otimiza todas as operações de um armazém,
          desde o recebimento e armazenamento até a separação, embalagem e expedição
           de produtos.
         */
        int palet, soma = 0;
        do {
        System.out.println("Digite o numero do palet");
        palet = sc.nextInt();
        soma++;
        }while(palet != -1);
        System.out.println("Palets coferidos: "+soma);
    }
}
