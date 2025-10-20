package Do_While_EAD;

import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Leitura de Códigos de Defeito");
        String codigo;
        int DO1= 0, DO2= 0, DO3= 0;
        do {
            System.out.println("Digite o codigo: (DO1, DO2, DO3) ou digite FIM");
            codigo = sc.nextLine();
            if (codigo.equalsIgnoreCase("do1")) {
                DO1++;
            }else if (codigo.equalsIgnoreCase("do2")) {
                DO2++;
            }else if (codigo.equalsIgnoreCase("do3")) {
                DO3++;
            }else if (codigo.equalsIgnoreCase("fim")) {
                System.out.println("Fechando programa..");
            }else {
                System.out.println("Digite uma resposta valida");            }
        }while(!codigo.equalsIgnoreCase("fim"));
        System.out.println("DO1: "+DO1);
        System.out.println("DO2: "+DO2);
        System.out.println("DO3: "+DO3);
    }
}
