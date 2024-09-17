package com.ubk.bank.money.transfer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    @JsonProperty("timestamp")
    public String timestamp;

    @JsonProperty("transactionNumber")
    public String transactionNumber;

    @JsonProperty("transactionStatus")
    public String transactionStatus;

    @JsonProperty("failureReason")
    public String failureReason;

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
