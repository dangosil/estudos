public class Horista extends Funcionario {
    private int horasTrabalhadas;
    private final double valorHora = 50.0;

    public Horista(String nome, String cpf, int horasTrabalhadas) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }
}
