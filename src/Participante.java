public class Participante {
    private String nome;
    private String email;

    public Participante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + " - " + email;
    }
}
