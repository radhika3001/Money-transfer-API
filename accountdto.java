package com.ubk.bank.money.transfer.models;

import org.apache.commons.fileupload.util.LimitedInputStream;

public class AccountDto {
    private String balance;
    private String currency;
    private Limits limits;

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    public static class Limits {

        private String monthly;
        private String daily;

        public String getMonthly() {
            return monthly;
        }

        public void setMonthly(String monthly) {
            this.monthly = monthly;
        }

        public String getDaily() {
            return daily;
        }

        public void setDaily(String daily) {
            this.daily = daily;
        }
    }
}
