package Do_While_EAD;

import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calibração de Sensor (Faixa Aceitável)");
        double cali;
        do {
            System.out.println("Digite o valor da calibração");
            cali = sc.nextDouble();
        }while (cali<4.0 || cali>22.0);
        System.out.println("Calibração OK: "+cali);
    }
}
