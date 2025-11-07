package atv_20_for_each;

import java.util.Scanner;

public class _02_filtrar_palavras_curtas {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] separar = new String[4];
            for (int i = 0; i < 4; i++) {
                System.out.println("Digite uma palavra");
                separar[i] = sc.nextLine();
            }
            for (String zeus : separar) {
                if (zeus.length() == 4) {
                    System.out.print(zeus+ ", ");
                } else {
                    System.out.print(" ");
                }
        }
    }
}
