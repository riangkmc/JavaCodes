package aplication;

import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class main {
    static void main() {
        Product produto1 = new Product("sopa",5.99);
        System.out.println(produto1);
        OrderItem orderItem1 = new OrderItem(produto1,5,5.49);
        System.out.println(orderItem1);
        System.out.println(orderItem1.subTotal());
    }
}
