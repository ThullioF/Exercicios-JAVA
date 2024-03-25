import ex2.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();
        cartoes.add(new DiaDosNamorados("Fulano"));
        cartoes.add(new Natal("Ciclano"));
        cartoes.add(new Aniversario("Beltrano"));

        for (CartaoWeb item: cartoes){
            item.showMessage();
        }
    }
}