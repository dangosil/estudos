package calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if ( classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os favoritos atualmente.");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliado atualmente.");
        } else {
            System.out.println("Adicionar a lista para assistir mais tarde.");
        }
    }
}
