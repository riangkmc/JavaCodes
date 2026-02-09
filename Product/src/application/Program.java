package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product1 = new Product("Carro",1222);
        System.out.println(product1.priceTag());
        Product product2 = new ImportedProduct("ventilador",1200,200.00);
        System.out.println(product2.priceTag());
        Product product3 = new UsedProduct("ventilador",1200,LocalDate.parse("2019-05-05"));
        System.out.println(product3.priceTag());



    }
}
