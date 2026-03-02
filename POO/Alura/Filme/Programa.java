import modelos.Filme;

public class Programa {
    static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setTitulo("Os Vingadores");
        filme1.setAnoLancamento(2012);
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
    }
}
