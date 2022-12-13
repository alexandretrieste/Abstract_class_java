package classes;

public class Carga extends Veiculo {
    private int cargaMax;
    private int tara;

    public Carga(int cargaMax, int tara) {
        super();
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }
}
