package com.bank.model;
public class AccountDto {

    private String code;

    private double balance;

    public String getCode() {
        return code;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountDto(){

    }
    public AccountDto(String code, double balance){
        this.code = code;
        this.balance = balance;
    }
}