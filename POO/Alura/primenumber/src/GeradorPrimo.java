public class GeradorPrimo extends NumeroPrimo{
    public int gerarPrimo(int ultimoPrimo) {
        int proximoN = ultimoPrimo;
        while(!verificarPrimo(proximoN)) {
            proximoN++;
        }
        return proximoN;
    }
}
