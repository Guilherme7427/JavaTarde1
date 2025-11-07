package modularizacao_para_orientacao.ead.Atv4;

public class calculadora {
    public int numero;
    public int max(){
        int fatorial = 1;
        int termo = 1;
        while (fatorial <= numero) {
            termo *= fatorial;
            fatorial++;
        }
        return termo;
    }
}
