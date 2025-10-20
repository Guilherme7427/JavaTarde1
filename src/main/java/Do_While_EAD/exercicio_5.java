package Do_While_EAD;

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lote de Impressão 3D (Peso Máximo)");
        int n1;
        System.out.println("Digite ENTER para começar");
        sc.nextLine();
        int soma = 0, ciclo = 0;
        do {
            System.out.println("Informe o peso da peça de lote. Peso atual: "+soma);
            n1 = sc.nextInt();
            soma+=n1;
            ciclo++;
        }while (soma<500);
        System.out.println("Peças: "+ciclo + " | " + "Peso total: "+soma);
    }
}
