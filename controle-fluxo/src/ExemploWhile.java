import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50;

        while ( mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                break;
            }

            System.out.println("Doce de valor: " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;
            System.out.println("Mesada restante: " + mesada);
        }

        System.out.println("Mesada restante: " + mesada);
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 10);
    }
}
