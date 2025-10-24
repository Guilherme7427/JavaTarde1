package Atv_11_IfElse_PS;

import java.util.Locale;
import java.util.Scanner;

public class _08_impressora_3d {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Em qual % o material se localiza ?");
        int material = sc.nextInt();

        String stat = max(material);
        resultado(stat);
        sc.close();
    }
    public static String max(int material) {
        String impressora;
        if (material < 20) {
            impressora = "Deve trocar o material da impressora";
        }else {
            impressora = "A impressora tem uma boa quantia de material";
        }
        return impressora;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
