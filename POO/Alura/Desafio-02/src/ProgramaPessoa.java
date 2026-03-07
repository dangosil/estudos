public class ProgramaPessoa {
    static void main(String[] args) {
        IdadePessoa pessoa1 =  new IdadePessoa();
        pessoa1.setIdade(26);
        pessoa1.setNome("Daniel");

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setIdade(24);
        pessoa2.setNome("Yas");

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificaIdade();
        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificaIdade();
    }
}
