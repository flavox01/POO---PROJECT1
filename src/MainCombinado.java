import java.util.Scanner;

public class MainCombinado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criar a clínica e adicionar médicos
        Clinica clinica = new Clinica("Clínica Exemplo", "Rua das Flores, 123");

        // Criar médicos e adicionar à clínica
        Medico medico1 = new Medico("Flavio Lopes", "Psiquiatra", "2025");
        Medico medico2 = new Medico("Catarina Silva", "Obstetra", "0061");
        Medico medico3 = new Medico("Elisa Alves", "Dentista", "0091");
        Medico medico4 = new Medico("Lucas Leal", "Veterinário", "8365");
        Medico medico5 = new Medico("Vinicius Souza", "Nutricionista", "0011");

        clinica.adicionarMedico(medico1);
        clinica.adicionarMedico(medico2);
        clinica.adicionarMedico(medico3);
        clinica.adicionarMedico(medico4);
        clinica.adicionarMedico(medico5);

        // Agendamento de consultas
        System.out.println("Bem-vindo ao Sistema de Clínica Médica!");
        System.out.println("Escolha o médico para agendar uma consulta:");

        // Listar médicos com especialidade e CRM
        for (int i = 0; i < clinica.getMedicos().size(); i++) {
            Medico medico = clinica.getMedicos().get(i);
            System.out.println((i + 1) + ". " + medico.getNome() + " - " + medico.getEspecialidade() + " (CRM: " + medico.getCrm() + ")");
        }

        int medicoEscolhido = sc.nextInt();
        sc.nextLine();  // Consumir o \n

        // Verifica se o médico escolhido é válido
        if (medicoEscolhido > 0 && medicoEscolhido <= clinica.getMedicos().size()) {
            Medico medico = clinica.getMedicos().get(medicoEscolhido - 1);
            System.out.println("Você escolheu agendar uma consulta com Dr(a). " + medico.getNome());

            // Agora vamos cadastrar o paciente
            System.out.println("Digite o nome do paciente:");
            String nomePaciente = sc.nextLine();
            System.out.println("Digite o CPF do paciente (formato: xxx.xxx.xxx-xx):");
            String cpfPaciente = sc.nextLine();
            System.out.println("Digite a idade do paciente:");
            int idadePaciente = sc.nextInt();
            sc.nextLine();  // Consumir o \n

            Paciente paciente = new Paciente(nomePaciente, cpfPaciente, idadePaciente);
            clinica.adicionarPaciente(paciente);

            System.out.println("Consulta agendada para " + paciente.getNome() + " com Dr(a). " + medico.getNome());
        } else {
            System.out.println("Médico inválido! Tente novamente.");
        }
    }
}
