import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
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







    }
}
