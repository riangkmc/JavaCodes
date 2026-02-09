package entities;

public class ImportedProduct extends Product{

    private double customsFree;

    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public double totalPrice(){
        return getPrice() + customsFree;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + totalPrice() + " (Custom fee: $ " + customsFree + ")";
    }




}
