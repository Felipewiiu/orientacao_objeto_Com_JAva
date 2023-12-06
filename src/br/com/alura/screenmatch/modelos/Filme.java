package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

// É preciso colocar os atributos como público para outras classes poderem enchergar esse arquivo
public class Filme extends Titulo implements Classificavel { // usando a interface Classificável como contrato
    private String diretor;

    public Filme(String nome) {
        this.setNome(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) { // aqui está a importância do this
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override // Aqui correu a sobrescrita do toString
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + " )";
    }


}
