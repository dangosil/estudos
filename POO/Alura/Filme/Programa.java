public class Programa {
    static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.titulo = "Os Vingadores";
        filme1.anoLancamento = 2012;
        filme1.duracaoMinutos = 142;
        filme1.incluidoPlano = true;
        filme1.avaliar(8);
        filme1.avaliar(9);
        filme1.avaliar(10);

        System.out.println(filme1.titulo);
        System.out.println(filme1.anoLancamento);

        filme1.exibeFicha();

        System.out.println("Número de avaliações: " + filme1.totalAvaliacoes);
        System.out.println("Média das avaliações: " + filme1.pegaMedia());
    }
}
