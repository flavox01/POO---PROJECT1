import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;

    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Consulta: " + paciente.getNome() + " - Médico: " + medico + " - Data e Hora: " + dataHora;
    }
}
