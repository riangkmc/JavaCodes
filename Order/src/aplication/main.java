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

        //criei novo cliente
        System.out.println("Enter cliente data:");
        System.out.print("Name:");
        String nome = sc.nextLine();
        System.out.print("Email:");
        String email = sc.nextLine();
        System.out.print("BirthDate(DD/MM/YYYY):");
        String birthDate = sc.nextLine();
        Client client1 = new Client(nome,email,LocalDate.parse(birthDate,fmt1));

        //criei pedido
        System.out.println("Enter order data:");
        System.out.print("Status:");
        String status = sc.nextLine().toUpperCase();
        Order order1 = new Order(LocalDateTime.now(),OrderStatus.valueOf(status));
        System.out.print("How many items to this order?");
        int totalProdutos = sc.nextInt();
        sc.nextLine();


        //cria o produto e itemorder e adiciona ao pedido
        for (int i = 0; i < totalProdutos; i++) {
            System.out.printf("Enter #%d item data:  %n",i + 1);
            System.out.print("Product name:");
            String nomeProduto = sc.nextLine();
            System.out.print("Product price:");
            double precoProduto = sc.nextDouble();
            Product product = new Product(nomeProduto,precoProduto);
            System.out.print("Quantity:");
            int quantity = sc.nextInt();
            sc.nextLine();
            OrderItem orderItem = new OrderItem(product,quantity,precoProduto);
            order1.addItem(orderItem);

        }
        System.out.println("ORDER SUMMARY:");
        System.out.printf("Order Moment: %s ",order1.getMoment().format(fmt1));
        System.out.printf("%nOrder statud: %s %n",order1.getStatus());
        System.out.println(client1);
        System.out.println("Order items:");
        for (OrderItem item : order1.getListItems()) {
            System.out.println(item);
        }
        System.out.print("Total Price:");
        System.out.println(order1.total());


        sc.close();
    }
}
