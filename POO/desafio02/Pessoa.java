//2

public class Pessoa {

    private String nome;
    private char sexo;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento, char sexo) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public int getIdade() {
        return idade;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        int idadeCalculada = anoAtual - this.anoNascimento;

        if (mesAtual < this.mesNascimento || (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento)) {
            idadeCalculada--;
        }

        this.idade = idadeCalculada;
    }

    public void exibeDados() {
        System.out.println("\nDados da Pessoa:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }
}