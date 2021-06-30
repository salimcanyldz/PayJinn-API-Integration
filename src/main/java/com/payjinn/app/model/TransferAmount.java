package com.payjinn.app.model;

public class TransferAmount {
	
    private String value;
    private String currency;

    public TransferAmount() {
	}

	public TransferAmount(String value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public String getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }
}
