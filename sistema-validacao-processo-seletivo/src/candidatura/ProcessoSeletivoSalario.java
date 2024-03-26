package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoSalario {
    public static void main(String[] args) {
        
        selecaoCandidatos();
    }

    static void analisarCandidado(double salarioPretendido){
        
        double salarioBase = 2000;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardar resultado dos demais candidatos");
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe","Carlos","Marcia","Luana","Ana","Paulo","Augusto","Monica","Fabricio"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;


        while(candidatosSelecionados <= 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato(a) " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            else{
                System.out.println("O candidato(a) " + candidato + " não foi selecionado");
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1700, 2200);
    }
}
