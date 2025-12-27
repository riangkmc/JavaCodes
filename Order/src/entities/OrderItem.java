package entities;

public class OrderItem {
    private Product product;
    private int quantity;
    private double price;

    public OrderItem(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return  product.getName() + ", " + product.getPrice() + ", Quantity: " +
                quantity + ", SubTotal: " + subTotal();

    }

    public Product getProduct() {
        return product;
    }


    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceTotal() {
        return price;
    }

    public void setPriceTotal(double price) {
        this.price = price;
    }

    public double subTotal(){
        return quantity * price;
    }
}
