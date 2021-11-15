package com.bank.api;

import com.bank.model.AccountDto;

public interface  ClientBankDomain {

public AccountDto getAccount(String code);

public AccountDto deposit(String name,double amount);

public AccountDto withdraw(String name,double amount);


}