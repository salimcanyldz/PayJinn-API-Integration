package com.payjinn.app.model;

public class RefundSum {
	
	private String value;
	private String currency;
	
	public RefundSum() {
	}

	public RefundSum(String value, String currency) {
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
