package com.bank.adapter;

import com.bank.model.AccountDto;
import com.bank.spi.ClientAccountRepository;
import com.bank.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.repository.ClientJpaRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class ClientRepositoryAdaptor implements ClientAccountRepository {

    @Autowired
    private ClientJpaRepository clientJpaRepository;

    @Override
    public AccountDto getAccount(String code) {

        Account account = (Account) clientJpaRepository.findByCode(code).get();
        if(account != null ){
            AccountDto accountDto = new AccountDto(account.getCode(), account.getBalance());
            return accountDto;
        }
        else {
        return  null;}

    }

    @Override
    public AccountDto deposit(String name, double amount) {

        Account account = (Account) clientJpaRepository.findById(name).get();
        if(account != null ){
            account.setBalance(account.getBalance() + amount);
            account = (Account) clientJpaRepository.save(account);

                AccountDto accountDto = new AccountDto(account.getCode(), account.getBalance());
                return accountDto;
        }else {
            return null;
        }
    }

    @Override
    public AccountDto withdraw(String name, double amount) {

        Account account = (Account) clientJpaRepository.findById(name).get();
        if(account != null ){
            account.setBalance(account.getBalance() - amount);
            account = (Account) clientJpaRepository.save(account);

            AccountDto accountDto = new AccountDto(account.getCode(), account.getBalance());
            return accountDto;
        }else {
            return null;
        }
    }
}
