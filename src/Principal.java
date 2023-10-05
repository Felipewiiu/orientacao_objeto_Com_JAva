public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        // nesse caso "Filme" seria o tipo da variável
        // Esse recurso é chamado de tipo por referência

        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 2023;
        meuFilme.duracaoEmMinuto = 180;


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.0);
        meuFilme.avalia(5.0);
        meuFilme.avalia(10);


        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());








    }
}
