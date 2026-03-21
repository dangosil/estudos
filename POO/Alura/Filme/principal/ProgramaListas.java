package principal;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramaListas {
    static void main(String[] args) {
        Filme filme1 = new Filme("Os Vingadores", 2012, 142);
        filme1.avaliar(10);
        var filmeDaniel = new Filme("É assim que acaba", 2024, 200);
        filmeDaniel.avaliar(10);
        Serie OnePiece = new Serie("One Piece", 1997, 20);
        OnePiece.setEpisodiosPorTemporada(30);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(OnePiece);
        lista.add(filme1);
        lista.add(filmeDaniel);

        System.out.println();
//        lista.forEach(System.out::println);

        for (Titulo titulo : lista) {
            System.out.println(titulo.getTitulo());
            if(titulo instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao() + " estrelas");
            }

        }

        System.out.println();
        System.out.println("Lista de Títulos:");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println();

        Titulo maiorDuracao = lista.get(0);

        for (Titulo titulo : lista) {
            if (titulo.getDuracaoMinutos() > maiorDuracao.getDuracaoMinutos()) {
                maiorDuracao = titulo;
            }
        }

        System.out.println("O título com maior duração é " + maiorDuracao.getTitulo() + " com " + maiorDuracao.getDuracaoMinutos() + " minutos.");

    }
}
