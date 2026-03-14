package model;

public class PessoaJuridica extends Pessoa{

    private int numerosFuncionarios;

    public PessoaJuridica(String name, double rendaAnual, int numerosFuncionarios) {
        super(name, rendaAnual);
        this.numerosFuncionarios = numerosFuncionarios;
    }

    public int getNumerosFuncionarios() {
        return numerosFuncionarios;
    }

    public void setNumerosFuncionarios(int numerosFuncionarios) {
        this.numerosFuncionarios = numerosFuncionarios;
    }

    @Override
    public String toString() {
        return "name: " + getName() +
                " Renda anual: " + getRendaAnual() +
                " Numeros funcionarios: "+ getNumerosFuncionarios();
    }

    @Override
    public double calculoImposto(){
        double taxa = (numerosFuncionarios > 10)? 0.14 : 0.16;
        return getRendaAnual() * taxa;

    };

}
