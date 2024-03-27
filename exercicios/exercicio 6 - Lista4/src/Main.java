import ex6.*;
public class Main {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial("Fulano",5000,10000,40000,1);

        conta1.deposito(1000);
        conta1.retornaSaldo();

        conta1.retira(500);
        conta1.retornaSaldo();

        Conta conta2 = new Conta("Ciclano", 5000, 10000, 40000,2);

        conta2.deposito(1000);
        conta2.retornaSaldo();

        conta2.retira(500);
        conta2.retornaSaldo();
    }
}