package modularizacao_para_orientacao.ead.Atv7;

public class primo {
    public int n1;
    public String max() {
        int divisores = 0;
        String primo;
        for(int i = 1; i<=n1; i++) {
            if(n1 % i == 0) {
                divisores++;
            }
        }
        if(divisores==2) {
            primo = "O numero "+n1+" é primo";
        }else {
            primo = "O numero não é primo";
        }
        return primo;
    }
}
