import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = terminal.nextInt();

        try{
            contar(primeiroNumero, segundoNumero);
        }
        catch(NumeroInvalidoException exception){
            System.out.println("Atenção, o segundo número deve ser maior que o primeiro");;
        }

        terminal.close(); 
    }
    static void contar(int primeiroNumero, int segundoNumero) throws NumeroInvalidoException{
        if(primeiroNumero > segundoNumero){
            throw new NumeroInvalidoException();
        }
        
        int contagemNumero = segundoNumero - primeiroNumero;

        for (int x = 1; x <= contagemNumero; x++){
            System.out.println("Imprimindo o número " + x);
        }
    }
}
