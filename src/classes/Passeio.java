package classes;

public class Passeio extends Veiculo {
    private int qtdePassageiros;

    public Passeio(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }
}
