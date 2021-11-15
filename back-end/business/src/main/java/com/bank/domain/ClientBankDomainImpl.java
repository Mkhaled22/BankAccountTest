package com.bank.domain;

import com.bank.api.ClientBankDomain;
import com.bank.model.AccountDto;
import com.bank.spi.ClientAccountRepository;

public class ClientBankDomainImpl implements ClientBankDomain {

    private ClientAccountRepository clientAccountRepository;

    @Override
    public AccountDto getAccount(String code) {
        return clientAccountRepository.getAccount(code);
    }

    @Override
    public AccountDto deposit(String name, double amount) {
        return clientAccountRepository.deposit(name,amount);
    }

    @Override
    public AccountDto withdraw(String name, double amount) {
        return clientAccountRepository.withdraw(name,amount);
    }
}
