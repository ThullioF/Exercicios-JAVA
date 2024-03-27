import ex5.*;
public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Fulano",2500,10000,2000,1);

        conta1.deposito(1000);
        conta1.retornaSaldo();

        conta1.retira(500);
        conta1.retornaSaldo();
    }
}