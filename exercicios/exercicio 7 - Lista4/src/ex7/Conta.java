package ex7;
public class Conta {
    private String nome;
    private float salario, saldo, limite;
    private int nr_conta;

    public Conta(String nome, float salario, float saldo, float limite, int nr_conta) {
        this.setNome(nome);
        this.setSalario(salario);
        this.setSaldo(saldo);
        this.setLimite(limite);
        this.setNr_conta(nr_conta);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getNr_conta() {
        return nr_conta;
    }
    public void setNr_conta(int nr_conta) {
        this.nr_conta = nr_conta;
    }

    public void deposito(float valor){
        saldo += valor;
        System.out.println("Foi realizado um despósito de " + valor);
    }

    public boolean retira(float valor){
        if (saldo >= valor ){
            saldo -= valor;
            System.out.println("Foi realizado uma retira de " + valor);
            return true;
        }
        else {
            System.out.println("Não foi possível realizar a retirada, pois o saldo é insuficiente");
            return false;
        }
    }

    public void retornaSaldo(){
        System.out.println("Saldo atual é de " + saldo);
    }
}
