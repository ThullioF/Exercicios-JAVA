import ex3.*;
public class Main {
    public static void main(String[] args) {
        Radio rad2 = new Radio(5,10,6,"Aquela");
        Tv tv1 = new Tv(1,0,3);

        rad2.testaUnidade();
        rad2.setaVolume(90);
        rad2.trocaEstacao(8);
        rad2.trocaBanda("Cidade");

        tv1.testaUnidade();
        tv1.setaVolume(40);
        tv1.trocaCanal(5);

        System.out.println(rad2.toString());
        System.out.println(rad2.Escutar());

        System.out.println(tv1.toString());
        System.out.println(tv1.assistir());
    }
}