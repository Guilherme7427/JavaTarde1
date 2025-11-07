package modularizacao_para_orientacao.ead.Atv8;

public class juroscompostos {
    public double capital;
    public double taxa;
    public double meses;

    public String max() {
        double montante = capital;
        int tempo = 1;
        double taxaDecimal = taxa / 100;
        while (tempo <= meses) {
            montante = montante * (1 + taxaDecimal);
            tempo++;
        }
        double juros = montante - capital;

        return String.format("Montante final: R$ %.2f | Juros: R$ %.2f", montante, juros);
    }
}
