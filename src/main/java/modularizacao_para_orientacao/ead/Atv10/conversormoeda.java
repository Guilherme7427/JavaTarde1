package modularizacao_para_orientacao.ead.Atv10;

public class conversormoeda {
    public String entrada;
    public String converter() {
        String[] partes = entrada.split(" ");

        if (partes.length < 2) {
            return "Formato inválido! Use: valor moeda (ex: 100 real)";
        }

        double valor = Double.parseDouble(partes[0]);
        String moeda = partes[1].toLowerCase();
        double resultado;
        String resposta;

        if (moeda.equals("real") || moeda.equals("reais")) {
            resultado = valor / 5.50;
            resposta = "R$ " + valor + " = US$ " + resultado;

        } else if (moeda.equals("dolar") || moeda.equals("dolares")) {
            resultado = valor * 5.50;
            resposta = "US$ " + valor + " = R$ " + resultado;

        } else if (moeda.equals("euro") || moeda.equals("euros")) {
            resultado = valor * 6.00;
            resposta = "€ " + valor + " = R$ " + resultado;

        } else {
            resposta = "Moeda não suportada! Use: real, dolar ou euro";
        }

        return resposta;
    }
}

