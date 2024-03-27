import ex7.Cartao;
import ex7.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Fulano",5000,10000,5000,1);
        Cartao cartao1 = new Cartao(conta1,"123456");

        conta1.deposito(1000);
        cartao1.retira(3000,"123456");

        cartao1.alteraSenha("123456","654321");
        cartao1.saldoSenha("654321");
    }
}