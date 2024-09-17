package com.ubk.bank.money.transfer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountResponse {


    @JsonProperty("status")
    public String status;
    @JsonProperty("data")
    public Data data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
