package modularizacao_para_orientacao.ead.Atv3;

public class contar {
    public String frase;
    public String max() {
        String sep;
        while (true) {
            String[] palavra = frase.split(" ");
            for (int i = 0; i< palavra.length; i++) {
                System.out.println("Separando palavras: "+palavra[i]+ " "+i);
            }
            sep= "Total de palavras: "+palavra.length;
            break;
        }
        return sep;
    }
}
