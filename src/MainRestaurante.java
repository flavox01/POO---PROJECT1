import java.util.Scanner;

public class MainRestaurante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cardápio e preços
        String[] cardapio = {
                "1. Pizza - R$ 30.00",
                "2. Hamburguer - R$ 20.00",
                "3. Salada - R$ 15.00",
                "4. Refrigerante - R$ 5.00",
                "5. Suco - R$ 7.00"
        };
        double[] precos = {30.00, 20.00, 15.00, 5.00, 7.00};

        double total = 0.0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu do Restaurante:");
            for (String item : cardapio) {
                System.out.println(item);
            }

            System.out.print("Escolha o número do prato que deseja: ");
            int escolha = sc.nextInt();

            // Verifica se a opção é válida
            if (escolha > 0 && escolha <= cardapio.length) {
                double valorPedido = precos[escolha - 1];
                System.out.println("Você escolheu: " + cardapio[escolha - 1]);
                total += valorPedido;
                System.out.printf("Valor atual do pedido: R$ %.2f\n", total);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            // Perguntar se o cliente deseja pedir mais algo
            System.out.print("Deseja pedir mais algo? (S/N): ");
            char resposta = sc.next().toUpperCase().charAt(0);

            if (resposta != 'S') {
                continuar = false;  // Sair do loop se o cliente não quiser mais nada
            }
        }

        // Mostrar o valor total final
        System.out.printf("Total a pagar: R$ %.2f\n", total);

        // Perguntar a forma de pagamento
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Crédito");
        System.out.println("2. Débito");
        System.out.println("3. Espécie");
        System.out.println("4. Pix");

        int pagamentoEscolhido = sc.nextInt();

        switch (pagamentoEscolhido) {
            case 1:
                System.out.println("Você escolheu pagamento por Crédito.");
                break;
            case 2:
                System.out.println("Você escolheu pagamento por Débito.");
                break;
            case 3:
                System.out.println("Você escolheu pagamento em Espécie.");
                break;
            case 4:
                System.out.println("Você escolheu pagamento por Pix.");
                break;
            default:
                System.out.println("Forma de pagamento inválida.");
                break;
        }

        // Finalizar
        System.out.println("Seu pagamento foi aprovado!");
    }
}
