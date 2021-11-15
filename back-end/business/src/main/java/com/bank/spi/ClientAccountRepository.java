package com.bank.spi;

import com.bank.model.AccountDto;

public interface ClientAccountRepository {

    public AccountDto getAccount(String code);

    public AccountDto deposit(String name,double amount);

    public AccountDto withdraw(String name,double amount);
}
