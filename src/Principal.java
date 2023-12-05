import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
// Por mais que importamos a classe se seus atributos não forem públicos eles não poderam ser acessados.


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        // nesse caso "br.com.alura.screenmatch.modelos.Filme" seria o tipo da variável
        // Esse recurso é chamado de tipo por referência

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinuto(180);
        System.out.println("Duração do filme é: " + meuFilme.getDuracaoEmMinuto());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.0);
        meuFilme.avalia(5.0);
        meuFilme.avalia(10);



        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        String nome = "Felipe oliveira";

        System.out.println();


        // instânciando a classe série com a herança de título

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinuto());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinuto(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("soma total de tempo " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme(); // Nesse caso usamos a inferênca de tipos para  o filmeDoPaulo

        filmeDoPaulo.setDuracaoEmMinuto(200);
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);



        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista de Filmes contém " + listaDeFilmes.size() + " Filmes");
        System.out.println("Primeiro filme é " + listaDeFilmes.get(0).getNome());

        System.out.println(listaDeFilmes.toString());

        System.out.println("O toString do filme é " + listaDeFilmes.get(0).toString());











    }
}
