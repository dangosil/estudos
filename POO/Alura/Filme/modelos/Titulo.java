package modelos;

public class Titulo {
    private String titulo;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public double getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void exibeFicha() {
        System.out.println("Nome do filme: " + titulo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
        if (incluidoPlano) {
            System.out.println("Acesso permitido para assistir o filme.");
        } else {
            System.out.println("Você precisa assinar um dos planos para ter acesso ao filme.");
        }

    }

    public void avaliar(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return ((double) somaAvaliacoes / totalAvaliacoes);
    }
}
