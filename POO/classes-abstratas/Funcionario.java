public abstract class Funcionario {
    protected String nome;
    protected String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean validarCpf() {
        String soNumeros = cpf.replaceAll("[^0-9]", "");
        return soNumeros.length() == 11;
    }

    public abstract double calcularSalario();

    public void exibirDados() {
        double salario = calcularSalario();
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("CPF valido? " + (validarCpf() ? "Sim" : "Não"));
        System.out.printf("Salario: R$ %.2f\n", salario);
    }
}
