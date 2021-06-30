package com.payjinn.app.model;

public class TransactionCode {
    private Object Sales;
    private String value;

    public TransactionCode(Object Sales,float value) {
        this.Sales = Sales;
        this.value = String.valueOf(value);
    }

    public Object getSales() {
        return Sales;
    }

    public String getValue() {
        return value;
    }
}
