package Do_While_EAD;

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Leitura de sensores de temperatura de um forno industrial");
        int n1;
        do{
            System.out.println("Digite a temperatura atual do forno industrial");
            n1 = sc.nextInt();
            if (n1<800 || n1>1200) {
                System.out.println("Temperatura invalida, tente novamente");

            }
        }while (n1<800 || n1>1200);

        System.out.println("Temperatura valida: "+n1);
    }
}
