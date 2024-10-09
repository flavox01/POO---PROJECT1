public class Paciente {
    private String nome;
    private String cpf;
    private int idade;

    public Paciente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Paciente: " + nome + " - CPF: " + cpf + " - Idade: " + idade;
    }
}
