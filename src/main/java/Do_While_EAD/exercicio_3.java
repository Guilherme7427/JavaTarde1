package Do_While_EAD;

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Validação de codigo RFID");
        /*é um sistema que utiliza ondas de rádio para identificar
        e rastrear objetos automaticamente, sem a nessecidade de
        contato fisico ou visual
         */
        String n1;
        do {
            System.out.println("Digite o codigo");
            n1 = sc.nextLine();
            if (n1.length()!=8) {
                System.out.println("Codigo invalido");
                System.out.println("Tente novamente");
                n1 = sc.nextLine();
            }
        }while (n1.length()!=8);
        System.out.println("Codigo aprovado!");
    }
}
