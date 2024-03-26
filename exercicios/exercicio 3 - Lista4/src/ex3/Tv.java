package ex3;
public class Tv extends Produto{
    private int canal;

    public Tv(int numeroSerial, int volume) {
        super(numeroSerial, volume);
        this.canal = 1;
    }

    public String assistir() {
        return "Canal " + canal;
    }

    public void trocaCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Canal: " + canal;
    }
}

