import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double nota = 0;
        double media = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(i + "Digite sua avaliação do filme:");
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("Média é: " + media/3);
    }
}
