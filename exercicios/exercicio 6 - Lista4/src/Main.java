import ex6.*;
public class Main {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial("Fulano",5000,10000,15000,2);

        conta1.deposito(1000);
        conta1.retornaSaldo();

        conta1.retira(500);
        conta1.retornaSaldo();
    }
}