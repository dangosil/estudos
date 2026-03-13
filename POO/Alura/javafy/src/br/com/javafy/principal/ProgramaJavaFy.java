package br.com.javafy.principal;

import br.com.javafy.modelos.JavaMusica;
import br.com.javafy.modelos.JavaPodcast;
import br.com.javafy.modelos.MusicasFavoritas;

public class ProgramaJavaFy {
    static void main(String[] args) {
        JavaMusica musica1 = new JavaMusica();

        musica1.setTitulo("Taste Back");
        musica1.setArtista("Harry Styles");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduzido();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }

        JavaPodcast podcast1 = new JavaPodcast();

        podcast1.setTitulo("Hipster Ponto Tech");
        podcast1.setApresentador("Paulo Silveira");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduzido();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        MusicasFavoritas favoritas1 = new MusicasFavoritas();
        musica1.exibiFichaTecnica();
        favoritas1.inclui(musica1);

        System.out.println("------------------------------");
        podcast1.exibiFichaTecnica();
        favoritas1.inclui(podcast1);

    }
}
