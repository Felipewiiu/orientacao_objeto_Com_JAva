public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluesoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinuto;

    int getTotalDeAvaliacoes () {
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinuto);
    }
    
    void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia () {
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}
