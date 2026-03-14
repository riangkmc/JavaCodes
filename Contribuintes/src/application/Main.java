package application;

import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("enter the number of tax payers: ");
        int numeroContas = sc.nextInt();
        List<Pessoa> taxPayers = new ArrayList<>();
        for (int i = 0; i < numeroContas; i++) {
            System.out.printf("Tax payer %d data: %n",i +1);
            System.out.printf("fisica ou juridica (f/j)?" );
            String tipoConta = sc.next();
            System.out.printf("Name:");
            String nome = sc.next();
            System.out.printf("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            Pessoa pessoa;
            if(tipoConta.equals("f")){
                System.out.printf("Despesas medicas: ");
                double despesasMedicas = sc.nextDouble();
                pessoa = new PessoaFisica(nome,rendaAnual,despesasMedicas);
                taxPayers.add(pessoa);

            }else{
                System.out.printf("Numero de funcionarios: ");
                int numeroFuncionarios = sc.nextInt();
                pessoa = new PessoaJuridica(nome,rendaAnual,numeroFuncionarios);
                taxPayers.add(pessoa);


            }


        }

        System.out.println("TAXES PAID:");

        for (Pessoa pessoa : taxPayers ){
            System.out.println(String.format("%.2f",pessoa.calculoImposto()));
        }

        sc.close();
    }
}
