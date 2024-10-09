import java.util.List;  // Importando List
import java.util.ArrayList;  // Importando ArrayList
import java.util.Scanner;  // Importando Scanner

public class Clinica {
    private String nome;
    private String endereco;
    private List<Medico> medicos;
    private List<Paciente> pacientes;

    public Clinica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.medicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    // Método para adicionar médicos
    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    // Método para adicionar pacientes
    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    // Método para agendar consulta
    public void agendarConsulta() {
        Scanner sc = new Scanner(System.in); // Importação do Scanner

        System.out.println("Digite o nome do paciente  :");
        String nomePaciente = sc.nextLine();

        System.out.println("Digite o CPF do paciente (formato: xxx.xxx.xxx-xx):");
        String cpfPaciente = sc.nextLine();

        System.out.println("Digite a idade do paciente:");
        int idadePaciente = sc.nextInt();
        sc.nextLine(); // Consumir a linha após a leitura do número

        Paciente paciente = new Paciente(nomePaciente, cpfPaciente, idadePaciente);
        adicionarPaciente(paciente);

        System.out.println("Escolha o médico para a consulta:");
        for (int i = 0; i < medicos.size(); i++) {
            System.out.println((i + 1) + ". " + medicos.get(i).getNome());
        }
        int medicoEscolhido = sc.nextInt();
        sc.nextLine(); // Consumir a linha após a leitura do número

        if (medicoEscolhido > 0 && medicoEscolhido <= medicos.size()) {
            Medico medico = medicos.get(medicoEscolhido - 1);
            System.out.println("Consulta agendada com Dr(a). " + medico.getNome() + " para o paciente " + paciente.getNome());
        } else {
            System.out.println("Médico inválido!");
        }
    }

    // Getter para pacientes (necessário para o MainCombinado)
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    // Getter para médicos (necessário para o MainCombinado)
    public List<Medico> getMedicos() {
        return medicos;
    }
}
