import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args)  {
        
        try {
        //lendo os dados
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        //imprimindo os dados

        System.out.println("Olá, meu nome é: " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é: " + altura + "cm");

        scanner.close();
        }
        catch (java.util.InputMismatchException exception){
            System.out.println("Atenção. Os campos idade e altura devem ser numéricos !!!");
        }
    
    }
}
