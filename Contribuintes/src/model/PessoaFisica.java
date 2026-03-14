package model;

public class PessoaFisica extends Pessoa{
    private double gastosComSaude;

    public PessoaFisica(String name, double rendaAnual, double gastosComSaude) {
        super(name, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public String toString() {
        return "name: " + getName() +
                " Renda anual: " + getRendaAnual() +
                " Gastos com saude: "+ getGastosComSaude();
    }

    @Override
    public double calculoImposto(){
        double valorImposto;
        if (this.getRendaAnual() < 20000){
            valorImposto = getRendaAnual() * 0.15;
        }
        else {
            valorImposto =  getRendaAnual() * 0.25;
        }
        if (getGastosComSaude() > 0){
            valorImposto = valorImposto - getGastosComSaude() * 0.50;
        }
        return valorImposto;

    };
}
