package com.ubk.bank.money.transfer.service;

import com.ubk.bank.money.transfer.models.AccountDto;
import com.ubk.bank.money.transfer.models.AccountResponse;
import com.ubk.bank.money.transfer.utils.ExternalBankServiceClient;
import com.ubk.bank.money.transfer.utils.RestClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

//    @Value("")
//    AccountService accountService;

    @Autowired
    private ExternalBankServiceClient externalBankServiceClient;

    public AccountDto getAccountByNumber(String cif,String accountNumber) {
        return externalBankServiceClient.getAccountByNumber(cif,accountNumber);
    }

}
