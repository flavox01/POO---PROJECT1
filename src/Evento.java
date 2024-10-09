import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evento {
    private String nome;
    private String local;
    private int capacidade;
    private List<Participante> participantes;
    private int contadorParticipantes = 0;

    public Evento(String nome, String local, int capacidade) {
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
        participantes = new ArrayList<>();
    }

    public boolean adicionarParticipante(Participante participante) {
        if (contadorParticipantes < capacidade) {
            participantes.add(participante);
            contadorParticipantes++;
            return true;
        }
        return false;
    }

    public void gerarRelatorioParticipantes() {
        System.out.println("Participantes do evento: " + nome);
        for (Participante p : participantes) {
            System.out.println(p);
        }
    }

    public int getContadorParticipantes() {
        return contadorParticipantes;
    }
}
