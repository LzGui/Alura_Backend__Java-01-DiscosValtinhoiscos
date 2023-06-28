public class Condicional {
    public static void main(String[] args) {
        int lancamento = 2006;
        double nota = 8.9;
        boolean assinante = true;
        String tipoPlano = "plus";

        if (lancamento > 2022) {
            System.out.println("Lançamentos que os assinantes estão curtindo!");
        } else {
            System.out.println("Filmes que os assinantes estão curtindo!");
        }

        if (assinante && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Alugar o filme.");
        }
    }
}
