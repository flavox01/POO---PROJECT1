import java.util.Scanner; // Importando Scanner para poder utilizar no código

public class Restaurante {
    private String[] cardapio;
    private int[] precos;
    private int mesasOcupadas;
    private static final int CAPACIDADE_MAXIMA = 10;

    public Restaurante() {
        // Cardápio com 5 pratos (exemplo)
        this.cardapio = new String[]{"Pizza", "Hambúrguer", "Sushi", "Macarrão", "Salada"};
        this.precos = new int[]{30, 20, 50, 25, 15}; // Preços correspondentes aos pratos
        this.mesasOcupadas = 0;
    }

    // Método para exibir o menu
    public void menu() {
        System.out.println("Menu:");
        for (int i = 0; i < cardapio.length; i++) {
            System.out.println((i + 1) + ". " + cardapio[i] + " - R$ " + precos[i]);
        }
    }

    // Getter para o cardápio
    public String[] getCardapio() {
        return cardapio;
    }

    // Método para calcular o total a pagar
    public double calcularTotal(int pratoEscolhido) {
        if (pratoEscolhido > 0 && pratoEscolhido <= precos.length) {
            return precos[pratoEscolhido - 1];
        }
        return 0;
    }

    // Método para fazer pedido
    public void fazerPedido() {
        if (mesasOcupadas >= CAPACIDADE_MAXIMA) {
            System.out.println("Não temos mais mesas disponíveis.");
            return;
        }

        Scanner sc = new Scanner(System.in); // Agora o Scanner está importado corretamente

        System.out.println("\nEscolha o número da mesa (1 a " + CAPACIDADE_MAXIMA + "):");
        int numeroMesa = sc.nextInt();
        sc.nextLine(); // Consumir a linha

        if (numeroMesa < 1 || numeroMesa > CAPACIDADE_MAXIMA) {
            System.out.println("Número de mesa inválido.");
            return;
        }

        if (mesasOcupadas >= CAPACIDADE_MAXIMA) {
            System.out.println("Desculpe, o restaurante está cheio.");
            return;
        } else {
            mesasOcupadas++;
        }

        System.out.println("\nEscolha o prato do menu:");
        menu();
        int pratoEscolhido = sc.nextInt();
        sc.nextLine(); // Consumir a linha

        if (pratoEscolhido > 0 && pratoEscolhido <= cardapio.length) {
            System.out.println("Você escolheu: " + cardapio[pratoEscolhido - 1]);
            System.out.println("Valor total: R$ " + calcularTotal(pratoEscolhido));
        } else {
            System.out.println("Prato inválido.");
        }
    }
}
