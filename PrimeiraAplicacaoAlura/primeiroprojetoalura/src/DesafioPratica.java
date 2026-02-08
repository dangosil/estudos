void main() {
//        1
    double nota1 = 8.6;
    double nota2 = 7.7;
    double media = (nota1 + nota2) / 2;

    IO.println(media);
//        2
    double temperatura = 12.5;
    int temperaturaCasting = (int) temperatura;

    IO.println(temperatura);
    IO.println(temperaturaCasting);

//        3
    char letra = 'y';
    String nome = "Yas";

    String mensagem = "A letra é " + letra + " e a palavra é " + nome;
    IO.println(mensagem);

//        4
    double precoProduto = 99.99;
    int quantidade = 3;

    double totalDeProdutos = precoProduto * quantidade;
    String msgCompra = String.format("O valor da compra é R$%.2f", totalDeProdutos);

    IO.println(msgCompra);

//        5
    double valorEmDolares = 50.0;
    double valorEmReais = valorEmDolares * 4.94;

    String msgConversao = String.format("$%.2f equivale a R$%.2f.", valorEmDolares, valorEmReais);

    IO.println(msgConversao);

//        6

    double precoOriginal = 1299.0;
    double percentualDesconto = 10.0;

    double desconto = (percentualDesconto / 100.0) * precoOriginal;
    double precoComDesconto = precoOriginal - desconto;

    IO.println("Preço: R$" + precoOriginal);
    IO.println("Desconto: R$" + desconto);
    IO.println("Preço com desconto: R$" + precoComDesconto);

}
