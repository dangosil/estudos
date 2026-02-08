void main() {
    System.out.println("Esse é o Screen Match");
    System.out.println("Filme: Top Gun: Maverick");

    int anoDeLancamento = 2022;
    System.out.println("Ano de lançamento:" + anoDeLancamento);
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.1;

    // Média
    double media = (8.5 + 7.2) / 2;
    System.out.println(media);

    String sinopse;
    sinopse = """
            Filme de aventura com galã dos anos 80
            Muito bom!
            """;
    System.out.println(sinopse);


    int classificacao = (int) (media / 2);
    System.out.println(classificacao);








//    Práticas durante as aulas e leituras
//    String senha = "12345";
//    if (senha.equals("12345")) {
//        System.out.println("Acesso autorizado!");
//    } else {
//        System.out.println("Senha incorreta.");
//    }
//
//    String nome = "Maria";
//    int idade = 30;
//    double valor = 55.9999;
//    System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
//
//    String nome2 = "João";
//    int aulas = 4;
//
//    String mensagem = """
//                  Olá, %s!
//                  Boas vindas ao curso de Java.
//                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
//                  """.formatted(nome2, aulas);
//
//    System.out.println(mensagem);

}
