package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "balance", nullable = false)
    private double balance;

    @Column(name = "owner_id", nullable = false)
    private String ownerID;

    public String getCode() {
        return code;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(){

    }

    public Account(String code){
        this.code = code;

    }
}
