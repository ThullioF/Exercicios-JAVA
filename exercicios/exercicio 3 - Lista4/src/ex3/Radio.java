package ex3;
public class Radio extends Produto{
    private double estacao;
    private String banda;

    public Radio(int numeroSerial, int volume) {
        super(numeroSerial, volume);
        this.estacao = 0.0;
        this.banda = "";
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
