package ex3;
public class Tv extends Produto{
    private int canal;

    public Tv(int numeroSerial, int volume, int canal) {
        super(numeroSerial, volume);
        this.setCanal(canal);
    }

    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public boolean testaUnidade() {
        if (getTeste().equals("não testado")) {
            double chance = Math.random();
            if (chance < 0.9) {
                setTeste("aprovado");
                return true;
            } else {
                setTeste("reprovado");
                return false;
            }
        }
        return false; // Se já foi testado, retorna false
    }

    @Override
    public void setaVolume(int volume) {
        setVolume(volume);
    }

    public String assistir() {
        return "Canal " + canal;
    }

    public void trocaCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Tv{" + super.toString() +
                "canal=" + canal +
                '}';
    }
}

