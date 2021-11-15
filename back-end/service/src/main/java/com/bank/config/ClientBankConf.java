package com.bank.config;

import com.bank.adapter.ClientRepositoryAdaptor;
import com.bank.api.ClientBankDomain;
import com.bank.domain.ClientBankDomainImpl;
import com.bank.repository.ClientJpaRepository;
import com.bank.spi.ClientAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientBankConf {

    @Bean
    public ClientBankDomain clientAccountPersistence(){
        return  new ClientBankDomainImpl();
    }


}
