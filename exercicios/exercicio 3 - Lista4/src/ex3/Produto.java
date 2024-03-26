package ex3;
import java.util.Random;
public abstract class Produto {
    private int nrSerial, volume;
    private String teste = "não testado";

    public Produto(int nrSerial, int volume) {
        this.setNrSerial(nrSerial);
        this.setVolume(volume);
    }

    public int getNrSerial() {
        return nrSerial;
    }
    public void setNrSerial(int nrSerial) {
        this.nrSerial = nrSerial;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTeste() {
        return teste;
    }
    public void setTeste(String teste) {
        this.teste = teste;
    }

    public abstract boolean testaUnidade();

    public abstract void setaVolume(int volume);

    @Override
    public String toString() {
        return "Produto{" +
                "nrSerial=" + nrSerial +
                ", volume=" + volume +
                ", teste='" + teste + '\'' +
                '}';
    }
}
