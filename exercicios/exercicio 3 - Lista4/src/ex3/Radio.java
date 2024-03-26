package ex3;
public class Radio extends Produto{
    private double estacao;
    private String banda;

    public Radio(int numeroSerial, int volume, float estacao, String banda) {
        super(numeroSerial, volume);
        this.setEstacao(estacao);
        this.setBanda(banda);
    }

    public double getEstacao() {
        return estacao;
    }
    public void setEstacao(double estacao) {
        this.estacao = estacao;
    }

    public String getBanda() {
        return banda;
    }
    public void setBanda(String banda) {
        this.banda = banda;
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

    public String Escutar(){
        return estacao + " " + banda;
    }

    public void trocaEstacao(double novaEstacao) {
        this.estacao = novaEstacao;
    }

    public void trocaBanda(String novaBanda) {
        this.banda = novaBanda;
    }

    @Override
    public String toString() {
        return "Radio{" + super.toString() +
                "estacao=" + estacao +
                ", banda='" + banda + '\'' +
                '}';
    }
}
