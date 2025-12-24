package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> ListItems = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "moment=" + moment +
                ", status=" + status +
                ", ListItems=" + ListItems +
                '}';
    }

    public void addItem(OrderItem itemPedido){
        ListItems.add(itemPedido);

    }

    public void removeItem(OrderItem itemPedido){
        ListItems.remove(itemPedido);
    }

    public double total(){
        double sum = 0.0;
        for (OrderItem item : ListItems) {
            sum += item.subTotal();
        }
        return sum;
    }


    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getListItems() {
        return ListItems;
    }

}
