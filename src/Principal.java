import br.com.alura.screenmatch.modelos.Filme;
// Por mais que importamos a classe se seus atributos não forem públicos eles não poderam ser acessados.


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        // nesse caso "br.com.alura.screenmatch.modelos.Filme" seria o tipo da variável
        // Esse recurso é chamado de tipo por referência

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinuto(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.0);
        meuFilme.avalia(5.0);
        meuFilme.avalia(10);


        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        String nome = "Felipe oliveira";











    }
}
