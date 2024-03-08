package main;
import shoppingCart.ShoppingCart;
import carItem.CarItem;
import product.Product;
public class Main {
    public static void main(String[] args) {
        //crie tres produtos prod1, prod2, prod3, com valores quaisquer para suas variaveis
        //crie dois carrinhos de compra
        //o primeiro carrinho deve conter os itens de carrinho relacionados aos produtos prod1 e prod2
        //o segundo carrinho deve conter os itens de carrinho relacionados aos produtos prod2 e prod3
        //os valores dos itens de carrinho e dos carrinhos podem ter valores quaisquer

        Product prod1 = new Product(1,100,"Camiseta dri-fit");
        Product prod2 = new Product(2,150,"Chuteira");
        Product prod3 = new Product(3,50,"Bola");

        ShoppingCart cart1 = new ShoppingCart(4,1000);
        ShoppingCart cart2 = new ShoppingCart(5,1500);

        cart1.addCarItem(6,3,prod1);
        cart1.addCarItem(7,2,prod2);

        cart2.addCarItem(8,3,prod2);
        cart2.addCarItem(9,4,prod3);

        System.out.println(cart1.toString());
        System.out.println(cart2.toString());
    }
}