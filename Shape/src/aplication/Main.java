package aplication;

import entity.Circle;
import entity.Color;
import entity.Rectangle;
import entity.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the number of shapes: ");
        int numberShapes = sc.nextInt();
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < numberShapes ; i++) {
            System.out.printf("Shape %d data : %n", i + 1 );
            System.out.printf("Rectangle or Circle (r/c)? ");
            String formShape = sc.next();
            System.out.printf("Color (BLACK/BLUE/RED): ");
            String color = sc.next().toUpperCase();
            if (formShape.equals("r")){
                System.out.printf("Width:  ");
                double width = sc.nextDouble();
                System.out.printf("Heighh:  ");
                double height = sc.nextDouble();
                Shape shape1 = new Rectangle(Color.valueOf(color),width,height);
                shapes.add(shape1);

            }
            if (formShape.equals("c")){
                System.out.printf("Radius: ");
                double radius = sc.nextDouble();
                Shape shape1 = new Circle(Color.valueOf(color),radius);
                shapes.add(shape1);

            }

        }

        System.out.println("SHAPE AREAS:");
        for(Shape shape : shapes){
            System.out.println(String.format("%.2f", shape.area()));

        }

        sc.close();
    }
}
