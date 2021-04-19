package com.org.kris.bankgateway.domain;

public class AccountRequest {
    private String sortCode;
    private String accountNumber;
    private String [] providers;

    public AccountRequest(String sortCode, String accountNumber, String [] providers){
        this.sortCode=sortCode;
        this.accountNumber=accountNumber;
        this.providers=providers;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String[] getProviders() {
        return providers;
    }
}
