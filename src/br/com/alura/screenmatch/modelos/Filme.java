package br.com.alura.screenmatch.modelos;
// É preciso colocar os atributos como público para outras classes poderem enchergar esse arquivo
public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluesoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinuto;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluesoNoPlano() {
        return incluesoNoPlano;
    }

    public int getDuracaoEmMinuto() {
        return duracaoEmMinuto;
    }

    public int getTotalDeAvaliacoes () {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluesoNoPlano(boolean incluesoNoPlano) {
        this.incluesoNoPlano = incluesoNoPlano;
    }

    public void setDuracaoEmMinuto(int duracaoEmMinuto) {
        this.duracaoEmMinuto = duracaoEmMinuto;
    }

    public void exibeFichaTecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinuto);
    }
    
    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia () {
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}
