package modularizacao_para_orientacao.ead.Atv9;

public class classificaridade {
    public int idade;
    public String max() {
        String categoria;
        if (idade < 0) {
            categoria = "Idade inválida!";
        } else if (idade <= 12) {
            categoria = "Infantil";
        } else if (idade <= 17) {
            categoria = "Adolescente";
        } else if (idade <= 59) {
            categoria = "Adulto";
        } else {
            categoria = "Idoso";
        }
        return "Classificação: " + categoria;
    }
}

