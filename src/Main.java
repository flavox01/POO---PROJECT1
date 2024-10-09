import java.util.Scanner;  // Importando a classe Scanner

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Agora podemos usar o Scanner
        System.out.println("Escolha o sistema a ser iniciado:");
        System.out.println("1. Sistema de Clínica Médica");
        System.out.println("2. Sistema de Eventos");
        System.out.println("3. Sistema de Restaurante");
        System.out.print("Digite o número da opção: ");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                // Rodar o sistema da clínica médica
                System.out.println("Iniciando o Sistema de Clínica Médica...");
                MainClinica.main(args);
                break;
            case 2:
                // Rodar o sistema de eventos
                System.out.println("Iniciando o Sistema de Eventos...");
                MainEvento.main(args);
                break;
            case 3:
                // Rodar o sistema de restaurante
                System.out.println("Iniciando o Sistema de Restaurante...");
                MainRestaurante.main(args);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}