package main.java.org;

import main.java.org.account.model.entities.Account;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        try {
            System.out.printf("Enter account data: %n");
            System.out.printf("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.printf("Holder: ");
            String holder = sc.nextLine().trim();
            System.out.printf("Initial balance: ");
            BigDecimal initialBalance = sc.nextBigDecimal();
            sc.nextLine();
            System.out.printf("Withdraw limit: ");
            BigDecimal withdrawLimit = sc.nextBigDecimal();
            sc.nextLine();
            Account account1 = new Account(number, holder, initialBalance, withdrawLimit);
            System.out.printf("Enter amount fot withdraw: ");
            BigDecimal withdrawValue = sc.nextBigDecimal();
            sc.nextLine();
            account1.withdraw(withdrawValue);
            System.out.printf("New balance: ");
            System.out.println(account1.getBalance());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: valor digitado inválido para o campo esperado!");
        }
        sc.close();

    }
}