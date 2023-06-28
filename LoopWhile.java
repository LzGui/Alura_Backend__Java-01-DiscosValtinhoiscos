import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double nota = 0;
        double media = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação do filme (para encerrar digite -1):");
            nota = leitura.nextDouble();       
            if (nota != -1) {
                media += nota;
                totalNotas++;
            }
        }

        System.out.println("Média é: " + media/totalNotas);
    }
}
