public class Main {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(123,456,"Fulano",1000);
        Cliente obj2 = new Cliente(321,500,"Beltrano",2000);

        obj1.depositar(1000);
        obj1.sacar(400);
        System.out.println(obj1.toString());

        obj2.depositar(2000);
        obj2.sacar(1000);
        System.out.println(obj2.toString());
    }
}