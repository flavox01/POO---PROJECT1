import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Mesa mesa;
    private List<ItemDoPedido> itens;
    private double total;

    // Construtor
    public Pedido(Mesa mesa) {
        this.mesa = mesa;
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    // Adicionar item ao pedido
    public void adicionarItem(ItemDoPedido item) {
        itens.add(item);
        total += item.getPreco();
    }

    // Calcular total do pedido
    public double calcularTotal() {
        return total;
    }

    // Obter os itens do pedido
    public List<ItemDoPedido> getItens() {
        return itens;
    }

    // Exibir detalhes do pedido
    public void exibirPedido() {
        System.out.println("Pedido da mesa " + mesa.getNumero() + ":");
        for (ItemDoPedido item : itens) {
            System.out.println(item.getNome() + " - R$ " + item.getPreco());
        }
        System.out.println("Total: R$ " + total);
    }

    // Getter para a mesa
    public Mesa getMesa() {
        return mesa;
    }
}
