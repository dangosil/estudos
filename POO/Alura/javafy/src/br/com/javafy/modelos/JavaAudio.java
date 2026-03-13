package br.com.javafy.modelos;

public class JavaAudio {
    private String titulo;
    private int totalReproducoes;
    private int totalFavoritos;
    private int totalCurtidas;
    private double duracaoEmMinutos;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }


    public int getTotalFavoritos() {
        return totalFavoritos;
    }


    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void favoritos() {
        this.totalFavoritos++;
    }

    public void reproduzido() {
        this.totalReproducoes++;
    }

    public void exibiFichaTecnica() {
        System.out.println(this.titulo);
        System.out.println("Reproduções: " + this.totalReproducoes);
        System.out.println("Favoritos: " + this.totalFavoritos);
        System.out.println("Curtidas: " + this.totalCurtidas);
        System.out.println("Duração: " + this.duracaoEmMinutos);
        System.out.println(this.classificacao);
    }
}
