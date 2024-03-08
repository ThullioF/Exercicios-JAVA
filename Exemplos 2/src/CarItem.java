public class CarItem {
    private int id, quantity;
    Product product; //objeto-parte dentro do objeto-todo

    public CarItem() {
    }
    public CarItem(int id, int quantity, Product product) {
        this.setId(id);
        this.setQuantity(quantity);
        this.setProduct(product); //associção fraca - agregação //product é indepentedente do CarItem
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CarItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
