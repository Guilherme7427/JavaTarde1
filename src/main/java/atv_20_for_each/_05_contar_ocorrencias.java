package atv_20_for_each;


import java.util.Scanner;

public class _05_contar_ocorrencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho;
        System.out.println("Digite quantos códigos você quer verificar:");
        tamanho = sc.nextInt();
        sc.nextLine();

        String[] verificar = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o código " + (i + 1) + ":");
            verificar[i] = sc.nextLine();
        }
        String alvo;
        int contador;
        do {
            System.out.println("Digite o código alvo ou digite 'SAIR' para encerrar:");
            alvo = sc.nextLine();
            if (!alvo.equalsIgnoreCase("SAIR")) {
                contador = 0;
                for (String codigo : verificar) {
                    if (codigo.equalsIgnoreCase(alvo)) {
                        contador++;
                    }
                }
                System.out.println("Aparece " + contador + " vezes.");
            }
        } while (!alvo.equalsIgnoreCase("SAIR"));

        System.out.println("Encerrando programa.");
    }
}
