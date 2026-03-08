public class ProgramaPrimos {
    static void main(String[] args) {
        VerificadorPrimo verifica = new VerificadorPrimo();
        verifica.verificadorSeEhPrimo(17);
        verifica.verificadorSeEhPrimo(100);
        verifica.verificadorSeEhPrimo(891);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarPrimo(17);
        System.out.println("Próximo primo após 17 é: " + proximoPrimo);

        NumeroPrimo numeroP =  new NumeroPrimo();
        numeroP.listarPrimo(100);
    }
}
