package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.printf("Enter the number of products: ");
        int numberProducts = sc.nextInt();
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < numberProducts; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.printf("Commun, uses or imported (c/u/i)? ");
            String typeProduct = sc.next();
            System.out.printf("Name: ");
            String name = sc.next();
            System.out.printf("Price: ");
            double price = sc.nextDouble();
            Product product;

            if(typeProduct.equals("c")){
                product = new Product(name,price);
            }else if(typeProduct.equals("i")){
                System.out.printf("Customs fee: ");
                double customsFee = sc.nextDouble();
                product = new ImportedProduct(name,price,customsFee);
            }else {
                System.out.printf("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), fmt);
                product = new UsedProduct(name,price,manufactureDate);
            }
            products.add(product);
        }

        for (Product product : products){
            System.out.println(product.priceTag());
        }

        sc.close();



    }
}
