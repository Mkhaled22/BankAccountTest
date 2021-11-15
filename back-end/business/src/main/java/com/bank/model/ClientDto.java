package com.bank.model;

import java.util.List;

public class ClientDto {

    private String name;

    private List<AccountDto> accountList;

    public String getName() {
        return name;
    }

    public List<AccountDto> getAccountList() {
        return accountList;
    }
}