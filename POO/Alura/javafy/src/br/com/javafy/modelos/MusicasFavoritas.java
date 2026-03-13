package br.com.javafy.modelos;

public class MusicasFavoritas {

    public void inclui(JavaAudio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é um dos maiores sucessos da atualidade!");
        } else {
            System.out.println(audio.getTitulo() + " está fazendo sucesso!");
        }
    }
}
