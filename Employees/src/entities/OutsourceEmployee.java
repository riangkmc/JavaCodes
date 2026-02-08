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

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
