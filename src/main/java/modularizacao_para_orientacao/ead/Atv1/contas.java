package modularizacao_para_orientacao.ead.Atv1;

public class contas {
    public double n1;
    public double n2;
    public String opcao;

    public char max() {
        double resultado = 0;
        if (opcao.equalsIgnoreCase("/")) {
            resultado = n1 / n2;
        } else if (opcao.equalsIgnoreCase("*")) {
            resultado = n1 * n2;
        } else if (opcao.equalsIgnoreCase("+")) {
            resultado = n1 + n2;
        } else if (opcao.equalsIgnoreCase("-")) {
            resultado = n1 - n2;
        }
        System.out.print("o resultado da operação " + resultado);
        return 0;

    }
}
