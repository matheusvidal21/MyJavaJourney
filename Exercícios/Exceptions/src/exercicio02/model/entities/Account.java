package model.entities;

import model.exceptions.BusinessException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){}
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getHolder() { return holder; }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Double getBalance() {
        return balance;
    }
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }
    public void withdraw(Double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }
    private void validateWithdraw(Double amount){
        if(getWithdrawLimit() < amount && getBalance() < amount){
            throw new BusinessException("Not enough balance and the amount exceeds withdraw limit ");
        }
        if(getBalance() < amount){
            throw new BusinessException("Not enough balance");
        }
        if(getWithdrawLimit() < amount){
            throw new BusinessException("The amount exceeds withdraw limit");
        }
    }

}
