package ex7;
public class Cartao {
    private Conta conta;
    private String senha;

    public Cartao(Conta conta, String senha) {
        this.setConta(conta);
        this.setSenha(senha);
    }

    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean retira(float valor, String senha){
        if (this.senha.equals(senha)){
            conta.retira(valor);
            return true;
        }
        else {
            System.out.println("Não foi possível realizar a retirada, pois a senha está incorreta");
            return false;
        }
    }

    public void saldoSenha(String senha){
        if (this.senha.equals(senha)){
            conta.retornaSaldo();
        }
        else {
            System.out.println("Não foi possível ver o saldo, pois a senha está incorreta");
        }
    }

    public void alteraSenha(String senhaAntiga, String senhaNova){
        if(this.senha.equals(senhaAntiga)){
            this.senha = senhaNova;
            System.out.println("A senha foi alterada para " + senhaNova);
        }
        else {
            System.out.println("Não foi possível alterar a senha, pois a senha antiga está incorreta");
        }
    }
}
