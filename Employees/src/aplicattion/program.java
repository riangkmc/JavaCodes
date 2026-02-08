package aplicattion;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number of employes: ");

        List<Employee> listEmployees = new ArrayList<>();
        int employeesNumbers = sc.nextInt();
        for(int i = 0;i<employeesNumbers;i++){
            System.out.printf("Employee #%d data: %n", i + 1);
            System.out.printf("Outsourced (y/n)? ");
            String outSorced = sc.next().toLowerCase(Locale.ROOT);
            System.out.printf("Name: ");
            String name = sc.next();
            System.out.printf("Hours: ");
            int hours = sc.nextInt();
            System.out.printf("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            Employee employee;
            if (outSorced.equals("y")){
                System.out.printf("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employee = new OutsourceEmployee(name,hours,valuePerHour,additionalCharge);
            }
            else{
                employee = new Employee(name,hours,valuePerHour);
            }
            listEmployees.add(employee);
        }

        System.out.println("PAYMENTS: ");
        for(Employee employee : listEmployees){
            System.out.println(employee);
        }




        sc.close();
    }
}
