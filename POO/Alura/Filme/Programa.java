import calculos.CalculadoraTempo;
import modelos.Filme;
import modelos.Serie;

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
        CalculadoraTempo calcu =  new CalculadoraTempo();

        calcu.inclui(filme1);
        System.out.println(calcu.getTempoTotal());

        System.out.println("--------------------------------------------");
        Serie OnePiece = new Serie();
        OnePiece.setTitulo("One Piece");
        OnePiece.setAnoLancamento(1997);
        OnePiece.setTemporadas(18);
        OnePiece.setMinutosPorEpisodio(20);
        OnePiece.setEpisodiosPorTemporada(50);
        OnePiece.exibeFicha();
        System.out.println("Duração para maratonar One Piece: " + OnePiece.getDuracaoMinutos());
        calcu.inclui(OnePiece);
        System.out.println(calcu.getTempoTotal());

    }
}
