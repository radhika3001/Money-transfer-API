package com.ubk.bank.money.transfer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransferRequestDto {

    @JsonProperty("debit-leg")
    private DebitLeg debitLeg;
    @JsonProperty("credit-leg")
    private CreditLeg creditLeg;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("transactionNumber")
    private String transactionNumber;

    public DebitLeg getDebitLeg() {
        return debitLeg;
    }

    public void setDebitLeg(DebitLeg debitLeg) {
        this.debitLeg = debitLeg;
    }

    public CreditLeg getCreditLeg() {
        return creditLeg;
    }

    public void setCreditLeg(CreditLeg creditLeg) {
        this.creditLeg = creditLeg;
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

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public static class DebitLeg {

        @JsonProperty("account")
        private String account;

        @JsonProperty("amount")
        private String amount;

        @JsonProperty("currency")
        private String currency;

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
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
    }

    public static class CreditLeg {

        @JsonProperty("account")
        private String account;

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }
    }
}
