
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 30;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }
        else {
        System.out.println("Saldo insuficiente. Saldo atual: " + saldo);
        }
        
    }
}
