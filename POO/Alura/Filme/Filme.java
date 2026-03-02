public class Filme {
    String titulo;
    int anoLancamento;
    boolean incluidoPlano;
    double somaAvaliacoes;
    double totalAvaliacoes;
    int duracaoMinutos;

    void exibeFicha() {
        System.out.println("Nome do filme: " + titulo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
        if (incluidoPlano) {
            System.out.println("Acesso permitido para assistir o filme.");
        } else {
            System.out.println("Você precisa assinar um dos planos para ter acesso ao filme.");
        }

    }

    void avaliar(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    String pegaMedia(){
        return String.format("%.2f", (double) somaAvaliacoes / totalAvaliacoes);
    }
}
