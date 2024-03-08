package shoppingCart;
import java.util.ArrayList;
import java.util.List;
import carItem.CarItem;
import product.Product;
public class ShoppingCart {
    private int id;
    private float totalPrice;
    private List<CarItem> carItens;

    public ShoppingCart() {
        //alocar espaço na mamoria para o vetor
        this.carItens = new ArrayList<CarItem>();
    }
    public ShoppingCart(int id, float totalPrice) {
        this.setId(id);
        this.setTotalPrice(totalPrice);
        //alocar espaço na mamoria para o vetor
        this.carItens = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<CarItem> getCarItens() {
        return carItens;
    }
    public void setCarItens(List<CarItem> carItens) {
        this.carItens = carItens;
    }

    //metodo para adicionar um CarItem no vetor
    //caracteriza uma composição, pois CarItem é criado em função do ShoppingCart
    public void addCarItem(int id, int quantity, Product product){
        this.carItens.add(new CarItem(id, quantity,product));
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", carItens=" + carItens +
                '}';
    }
}
