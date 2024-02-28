public class Main {
    public static void main(String[] args) {
        Rio obj1 = new Rio("Sapucaí",9000,true);
        Rio obj2 = new Rio();

        obj1.chover(0);
        obj1.ensolarar(1000);
        obj1.limpar();
        System.out.println(obj1.toString());

        obj2.setNome("Amazonas");
        obj2.chover(2000);
        obj2.ensolarar(500);
        obj2.sujar();
        System.out.println(obj2.toString());
    }
}