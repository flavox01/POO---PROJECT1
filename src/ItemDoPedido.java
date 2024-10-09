public class ItemDoPedido {
    private String nome;
    private double preco;

    // Construtor
    public ItemDoPedido(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
