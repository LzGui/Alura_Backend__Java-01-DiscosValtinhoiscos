public class Start {
    public static void main(String[] args) {
        System.out.println("Discos do Valtinho");
        
        String titulo = "Tropa de Elite";
        String sinopse = "Filme sobre o BOPE";
        int lancamento = 2006;
        double nota = 8.9;
        double mediaNota = (8.9 + 7.5 + 9.1) / 3;
        boolean plano = true;

        String msg = """
                Filme: %s
                Sinopse: %s
                Lançamento: %d
                Nota: %.2f
                Média: %.2f
                """.formatted(titulo, sinopse, lancamento, nota, mediaNota);

        System.out.println(msg);
        
        /*
        System.out.println("Filme: " + titulo);
        System.out.println("Lançamento: " + anoLancamento);
        System.out.println("Nota: " + nota);
        */
    }
}