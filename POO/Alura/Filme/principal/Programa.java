package principal;

import calculos.CalculadoraTempo;
import calculos.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

import java.util.ArrayList;

public class Programa {
    static void main(String[] args) {
        Filme filme1 = new Filme("Os Vingadores", 2012);
        filme1.setDuracaoMinutos(142);
        filme1.setIncluidoPlano(true);
        filme1.avaliar(8);
        filme1.avaliar(9);
        filme1.avaliar(10);

        System.out.println(filme1.getTitulo());
        System.out.println(filme1.getAnoLancamento());

        filme1.exibeFicha();

        System.out.println("Número de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.println("Média das avaliações: " + filme1.pegaMedia());
        CalculadoraTempo calcu =  new CalculadoraTempo();

        calcu.inclui(filme1);
        System.out.println(calcu.getTempoTotal());

        System.out.println("--------------------------------------------");
        Serie OnePiece = new Serie("One Piece", 1997);
        OnePiece.setTemporadas(18);
        OnePiece.setMinutosPorEpisodio(20);
        OnePiece.setEpisodiosPorTemporada(50);
        OnePiece.exibeFicha();
        System.out.println("Duração para maratonar One Piece: " + OnePiece.getDuracaoMinutos());
        calcu.inclui(OnePiece);
        System.out.println(calcu.getTempoTotal());


        FiltroRecomendacao filtro =  new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio ep1 =  new Episodio();
        ep1.setNumero(1);
        ep1.setSerie(OnePiece);
        ep1.setTotalVisualizacoes(1000);
        filtro.filtra(ep1);

        var filmeDaniel = new Filme("É assim que acaba", 2024);
        filmeDaniel.setDuracaoMinutos(200);
        filmeDaniel.setAnoLancamento(2024);
        filmeDaniel.avaliar(10);

        ArrayList<Filme> listaFilmes = new ArrayList<>();

        listaFilmes.add(filmeDaniel);
        listaFilmes.add(filme1);
        System.out.println("Tamanho da lista de filmes: " + listaFilmes.size());
        System.out.println("Primeiro filme " + listaFilmes.get(0).getTitulo());
        System.out.println(listaFilmes);

        System.out.println("Primeiro filme: " + listaFilmes.get(0).toString());
        System.out.println("Segunddo filme: " + listaFilmes.get(1).toString());

//        for (Filme filme : listaFilmes) {
//            System.out.println(filme);
//        }

        System.out.println();
        listaFilmes.forEach(System.out::println);
    }
}
