package aplicattion;

import entities.Employee;
import entities.OutsourceEmployee;

public class program {
    static void main() {
        Employee employee1 = new Employee("rian",5,20.00);
        Employee employee2 = new Employee();
        Employee employee3 = new OutsourceEmployee("maria",4,10.00,220);
        employee2.setName("ronaldo");
        employee2.setHours(6);
        employee2.setValuePorHour(12.5);


        System.out.println(employee1.payment());
        System.out.println(employee2.payment());
        System.out.println(employee3.payment());
    }
}
