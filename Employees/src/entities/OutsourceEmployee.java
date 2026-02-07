package entities;

public class OutsourceEmployee extends Employee{

    private double additionalCharge;

    public OutsourceEmployee(String name, int hours, double valuePorHour, double additionalCharge) {
        super(name, hours, valuePorHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.10;
    }

}
