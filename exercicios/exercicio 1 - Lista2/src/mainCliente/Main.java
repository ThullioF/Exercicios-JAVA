package mainCliente;
import cliente.Cliente;
public class Main {
    public static void main(String[] args) {

         Cliente obj1 = new Cliente("123456-7","9876-5","Fulano",1000);

         obj1.realizarDeposito(4000);
         obj1.realizarSaque(500);
         System.out.println(obj1.toString());
    }
}