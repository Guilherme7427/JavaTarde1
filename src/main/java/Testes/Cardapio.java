package Testes;

import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pedido = sc.nextInt();
        System.out.println("Aperte ENTER para abrir o cardapio");
        sc.nextLine();
        System.out.println("Faça seu pedido agora!");
        System.out.println("CARDAPIO");
        System.out.println("1_Almoço");
        System.out.println("2_Petiscos");
        System.out.println("3_Lanches");
        System.out.println("4_Bebidas");
        pedido = sc.nextInt();
        if (pedido == 1) {
            System.out.println("ALMOÇOS");
            System.out.println("1_Mexidão");
            System.out.println("2_Arroz, Feijão e batata frita");
            System.out.println("3_Churrasco americano");
            System.out.println("4_Feijoada");
            System.out.println("5_Tropeiro");
            pedido = sc.nextInt();
            if (pedido == 1 || pedido == 2 || pedido == 3 || pedido == 4 || pedido == 5) {
                System.out.println("Almoço selecionado");
                System.out.println("Chave pix: 702.268.956.37");
            }
        }
    }
}
