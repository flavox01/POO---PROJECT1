public class Mesa {
    private int numero;
    private boolean ocupada;

    // Construtor
    public Mesa(int numero) {
        this.numero = numero;
        this.ocupada = false;  // Inicialmente, a mesa está desocupada
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void ocuparMesa() {
        if (!ocupada) {
            ocupada = true;
            System.out.println("Mesa " + numero + " ocupada.");
        } else {
            System.out.println("Mesa " + numero + " já está ocupada.");
        }
    }

    public void desocuparMesa() {
        if (ocupada) {
            ocupada = false;
            System.out.println("Mesa " + numero + " desocupada.");
        } else {
            System.out.println("Mesa " + numero + " já está desocupada.");
        }
    }
}
