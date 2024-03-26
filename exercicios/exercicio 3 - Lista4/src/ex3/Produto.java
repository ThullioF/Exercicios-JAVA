package ex3;
import java.util.Random;
public class Produto {
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

    public boolean testaUnidade() {
        if (teste.equals("não testado")) {
            Random random = new Random();
            double randomNumber = random.nextDouble();
            if (randomNumber < 0.9) {
                teste = "aprovado";
                return true;
            } else {
                teste = "reprovado";
                return false;
            }
        } else {
            System.out.println("O teste já foi realizado para este produto.");
            return false;
        }
    }

    public void setaVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nrSerial=" + nrSerial +
                ", volume=" + volume +
                ", teste='" + teste + '\'' +
                '}';
    }
}
