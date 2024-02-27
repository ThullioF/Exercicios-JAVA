public class Main {
    public static void main(String[] args) {
        Produto obj1 = new Produto(1,10,"peça de carro",1200);
        Produto obj2 = new Produto();

        obj1.comprar(10);
        obj1.vender(5);
        obj1.subir(5);
        obj1.descer(2);
        System.out.println(obj1.toString());

        obj2.comprar(10);
        obj2.vender(2);
        obj2.subir(200);
        obj2.descer(50);
        System.out.println(obj2.toString());
    }
}