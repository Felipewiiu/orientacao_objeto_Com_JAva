package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme s){
//        this.tempoTotal += s.getDuracaoEmMinuto();
//    }
//
//    public void inclui(Serie f){
//        this.tempoTotal += f.getDuracaoEmMinuto();
//    }

    public void inclui(Titulo titulo){
        System.out.println("adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinuto();
    }


}
