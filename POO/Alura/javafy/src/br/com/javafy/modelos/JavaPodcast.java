package br.com.javafy.modelos;

public class JavaPodcast extends JavaAudio{
    private String apresentador;
    private String descricao;
    private int temporada;
    private int numeroEpisodio;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }

    @Override
    public void exibiFichaTecnica() {
        System.out.println(apresentador);
        super.exibiFichaTecnica();
    }
}
