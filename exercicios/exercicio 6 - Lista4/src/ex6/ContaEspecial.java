package ex6;
public class ContaEspecial extends Conta{
    public ContaEspecial(String nome, float salario, float saldo, float limite, int nr_conta) {
        super(nome, salario, saldo, limite, nr_conta);
    }

    @Override
    public void setLimite(float limite){
        if (limite <= getSalario() * 3) {
            super.setLimite(limite);
        } else {
            System.out.println("O limite não pode ser 3x maior que o salário mensal");
        }
    }
}
