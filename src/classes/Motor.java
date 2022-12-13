package classes;

public class Motor {
    private int qtdePist;
    private int potencia;
    private Veiculo veiculo;

    public Motor(int qtdePist, int potencia, Veiculo veiculo) {
        this.qtdePist = qtdePist;
        this.potencia = potencia;
        this.veiculo = veiculo;
    }


    public int getQtdePist() {
        return qtdePist;
    }

    public void setQtdePist(int qtdePist) {
        this.qtdePist = qtdePist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
