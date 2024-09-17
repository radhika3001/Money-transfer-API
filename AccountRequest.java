package com.ubk.bank.money.transfer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountRequest {


    @JsonProperty("cif")
    public String cif;
    @JsonProperty("sourceAccount")
    public String sourceAccount;
    @JsonProperty("destinationAccount")
    public String destinationAccount;
    @JsonProperty("amount")
    public String amount;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("reason")
    public String reason;
    @JsonProperty("notes")
    public String notes;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
