package br.com.alura.screenmatch.modelos;
// É preciso colocar os atributos como público para outras classes poderem enchergar esse arquivo
public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) { // aqui está a importância do this
        this.diretor = diretor;
    }
}
