package com.ubk.bank.money.transfer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransferResponseDto {


    @JsonProperty("status")
    public String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
