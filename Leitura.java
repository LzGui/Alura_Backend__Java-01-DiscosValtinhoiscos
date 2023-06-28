import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um filme:");
        String filme = leitura.nextLine();
        
        System.out.println("Qual o ano de lançamento?");
        int lancamento = leitura.nextInt();
        
        System.out.println("Avaliação do filme:");
        double avaliacao = leitura.nextDouble();
    
        System.out.println(filme);
        System.out.println(lancamento);
        System.out.println(avaliacao);
    }
}
