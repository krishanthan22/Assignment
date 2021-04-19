package com.org.kris.bankgateway.domain;

public class AccountData {
    private String provider;
    private boolean isValid;

    public AccountData(String provider, boolean isValid){
        this.provider = provider;
        this.isValid = isValid;
    }

    public String getProvider() {
        return provider;
    }

    public boolean isValid() {
        return isValid;
    }
}
