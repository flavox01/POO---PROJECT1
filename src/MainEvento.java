import java.util.Scanner;

public class MainEvento {
    public static void main(String[] args) {
        Evento evento = new Evento("Conferência Java", "Auditório A", 100);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar participante");
            System.out.println("2. Gerar relatório");
            System.out.println("3. Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do participante:");
                    String nome = sc.nextLine();
                    System.out.println("Digite o email do participante:");
                    String email = sc.nextLine();
                    Participante participante = new Participante(nome, email);
                    if (evento.adicionarParticipante(participante)) {
                        System.out.println("Participante registrado com sucesso!");
                    } else {
                        System.out.println("O evento está lotado.");
                    }
                    break;
                case 2:
                    evento.gerarRelatorioParticipantes();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
