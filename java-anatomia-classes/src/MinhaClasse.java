
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Carlos Eduardo";
        String segundoNome = "Belo";

        String nameCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nameCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome + " " + segundoNome;
    }

}
