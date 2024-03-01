package main;
import produto.Produto;
public class Main {
    public static void main(String[] args) {
        Produto obj = new Produto();

        obj.setCodigo(10);
        obj.setCodigo(-5);
        obj.setQtde(30);
        obj.setQtde(-30);
        obj.setNota(40);
        obj.setNota(7);

        Produto obj2 = new Produto(10,200,9);
        Produto ob3 = new Produto(-10,-200,200);

        System.out.println("Código " + ob3.getCodigo() + " Nota " + ob3.getNota());
    }
}