package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalcomListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023 );
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2023);
        outroFilme.avalia(10);
        Serie lost = new Serie("lost", 2000);

        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());

            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }

        List<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adam sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");

        System.out.println(buscaPorArtista);

        System.out.println("Depois da ordenação");

        Collections.sort(buscaPorArtista);

        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("\n");

        System.out.println("Lista de titulos ordenados em ordem alfabetica");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("\n");

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));


        System.out.println("Ordenando por ano");
        System.out.println(lista);




    }
}
