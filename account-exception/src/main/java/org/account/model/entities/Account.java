package main.java.org.account.model.entities;

import java.math.BigDecimal;

public class Account {
    private Integer number;
    private String holder;
    private BigDecimal balance;
    private BigDecimal withdrawLimit;

    public Account(Integer number, String holder, BigDecimal balance, BigDecimal withdrawLimit) {
        setNumber(number);
        setHolder(holder);
        setBalance(balance);
        setWithdrawLimit(withdrawLimit);
    }

    public Account() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(BigDecimal withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(BigDecimal amount){
        if(amount.compareTo(BigDecimal.ZERO) <=0){
            throw new IllegalArgumentException("Valor inválido para depósito");
        }
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount){
        if(amount.compareTo(BigDecimal.ZERO) <=0) {
            throw new IllegalArgumentException("Não é possivel sacar valor negativo!");
        }
        if (amount.compareTo(getWithdrawLimit()) >0){
            throw new IllegalArgumentException("Limite insuficiente para sacar!");
        }
        if (amount.compareTo(getBalance()) > 0) {
            throw new IllegalArgumentException("saldo insuficiente para saque!");
        }

        balance = balance.subtract(amount);

    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
