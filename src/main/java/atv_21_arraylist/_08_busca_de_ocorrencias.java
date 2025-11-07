package atv_21_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _08_busca_de_ocorrencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ocorrencias = new ArrayList<>();
        String codigos;
        String alvo;
        int contador;
        do {
            System.out.println("Digite um codigo ou digite 'SAIR' para buscar o alvo");
            codigos = sc.nextLine();
            ocorrencias.add(codigos);
            if (!codigos.equalsIgnoreCase("sair")) {
              ocorrencias.add(codigos);
            } else {
                System.out.println("Digite o codigo alvo");
                alvo = sc.nextLine();
                contador = 0;
                for (String verificar : ocorrencias) {
                    if (verificar.equalsIgnoreCase(alvo)) {
                        contador++;
                    }
                    System.out.println("O alvo aparece " + contador + " vezes");
                }
            }

        } while (codigos.equalsIgnoreCase("SAIR")) ;

    }
}
