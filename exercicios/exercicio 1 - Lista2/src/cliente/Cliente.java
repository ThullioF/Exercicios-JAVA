package cliente;
public class Cliente {
    private String nome, numeroConta, numeroAgencia;
    private float saldo;
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    public Cliente(){

    }
    public void setNumeroConta(String numeroConta){
        if (numeroConta.length() == 8 && numeroConta.charAt(6) == '-'){
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Número de conta inválido");
        }
    }
    public void setNumeroAgencia(String numeroAgencia){
        if (numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-'){
            this.numeroAgencia = numeroAgencia;
        }
        else {
            System.out.println("Número de agência inválido");
        }
    }
    public void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            System.out.println("O nome não pode ultrapassar 30 caracteres");
        }
    }
    public void setSaldo(float saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else {
            System.out.println("Saldo não pode ser negativo");
        }
    }
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void realizarDeposito(float x){
        this.setSaldo(this.saldo + x);
    }
    public void realizarSaque(float x){
        this.setSaldo(this.saldo - x);
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", numeroAgencia='" + numeroAgencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
