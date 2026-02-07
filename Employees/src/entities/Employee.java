package entities;

public class Employee {
    private String name;
    private int hours;
    private double valuePorHour;

    public Employee(String name, int hours, double valuePorHour) {
        this.name = name;
        this.hours = hours;
        this.valuePorHour = valuePorHour;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", valuePorHour=" + valuePorHour +
                '}';
    }

    public double payment(){
        return hours * valuePorHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePorHour() {
        return valuePorHour;
    }

    public void setValuePorHour(double valuePorHour) {
        this.valuePorHour = valuePorHour;
    }


}
