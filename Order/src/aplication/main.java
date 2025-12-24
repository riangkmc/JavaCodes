package aplication;

import entities.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Product produto1 = new Product("sopa",5.99);
        System.out.println(produto1);
        Product produto2 = new Product("laranja",2.99);
        System.out.println(produto2);

        OrderItem orderItem1 = new OrderItem(produto1,5,5.49);
        System.out.println(orderItem1);
        System.out.println(orderItem1.subTotal());
        OrderItem orderItem2 = new OrderItem(produto2,10,2.99);
        System.out.println(orderItem2);
        System.out.println(orderItem2.subTotal());


        Order pedido1 = new Order(LocalDateTime.now(), OrderStatus.PROCESSING);
        System.out.println(pedido1);
        pedido1.addItem(orderItem1);
        pedido1.addItem(orderItem2);
        System.out.println(pedido1);
        System.out.println(pedido1.total());
        System.out.println(pedido1);


        String dataNascimento = sc.nextLine();
        Client cliente1 = new Client("rian","rian.barbosa@gmail.com", LocalDate.parse(dataNascimento,fmt1));
        cliente1.addOrder(pedido1);
        System.out.println(cliente1);






        sc.close();
    }
}
