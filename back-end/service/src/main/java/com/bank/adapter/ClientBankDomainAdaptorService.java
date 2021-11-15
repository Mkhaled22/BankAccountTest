package com.bank.adapter;

import com.bank.api.ClientBankDomain;
import com.bank.model.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ClientBankDomainAdaptorService {
@Autowired
private ClientBankDomain clientBankDomain;

    @GetMapping(path ="/account/{code}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountDto accountByCode(@PathVariable String code) {
        return clientBankDomain.getAccount(code);
    }

    /*@PutMapping("/deposit")
    public AccountDto updateBook(@RequestBody AccountDto AccountDto) {
        return clientBankDomain.deposit();
    }*/

    @GetMapping(path ="/deposit/{code}/{amount}",  produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountDto makeDeposit ( @PathVariable String code, @PathVariable double amount) {

        return this.clientBankDomain.deposit(code, amount);
    }

    @GetMapping(path = "/withdraw/{code}/{amount}")
    public AccountDto makeAwithdraw ( @PathVariable String code, @PathVariable double amount) {

        return this.clientBankDomain.withdraw(code, amount);
    }
}
