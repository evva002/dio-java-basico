
public class BoletimEstudante {
    public static void main(String[] args) {
        int mediaFinal = 8;
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Recuperação");
        else
            System.out.println("Aprovado");
    }
}
