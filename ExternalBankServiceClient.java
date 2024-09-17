package com.ubk.bank.money.transfer.utils;

import com.ubk.bank.money.transfer.models.AccountDto;
import com.ubk.bank.money.transfer.models.AccountResponse;
import com.ubk.bank.money.transfer.models.TransferRequestDto;
import com.ubk.bank.money.transfer.models.TransferResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "external-bank-service", url = "https://k0wo9.wiremockapi.cloud/api/v1")
public interface ExternalBankServiceClient {

    @GetMapping("/accounts/{cif}/{accountNumber}")
    AccountDto getAccountByNumber(@PathVariable("cif") String cif,@PathVariable("accountNumber") String accountNumber);

    @RequestMapping(method = RequestMethod.POST, value = "/local-transfer")
    TransferResponseDto transferMoney(@RequestBody TransferRequestDto request);
}