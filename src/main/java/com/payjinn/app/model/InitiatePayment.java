package com.payjinn.app.model;

public class InitiatePayment {

	private String clientOrderCode;
    private TransferAmount transferAmount;
    private String clientNotificationURL;
    private String clientSuccessURL;
    private String clientOnPaymentReceivedURL;
    private String baseAccountIBAN;
    private String languageCode;
    private String paymentCode;
    private int transactionCode;
    private String bookingId;

    public InitiatePayment(String clientOrderCode,
                           TransferAmount transferAmountObject,
                           String clientNotificationURL,
                           String clientSuccessURL,
                           String clientOnPaymentReceivedURL,
                           String baseAccountIBAN,
                           String languageCode,
                           String paymentCode,
                           int transactionCodeObject,
                           String bookingId) {

        this.clientOrderCode = clientOrderCode;
        transferAmount = transferAmountObject;
        this.clientNotificationURL = clientNotificationURL;
        this.clientSuccessURL = clientSuccessURL;
        this.clientOnPaymentReceivedURL = clientOnPaymentReceivedURL;
        this.baseAccountIBAN = baseAccountIBAN;
        this.languageCode = languageCode;
        this.paymentCode = paymentCode;
        transactionCode = transactionCodeObject;
        this.bookingId = bookingId;
    }

    public String getClientOrderCode() {
        return clientOrderCode;
    }

    public TransferAmount getTransferAmount() {
        return transferAmount;
    }

    public String getClientNotificationURL() {
        return clientNotificationURL;
    }

    public String getClientSuccessURL() {
        return clientSuccessURL;
    }

    public String getClientOnPaymentReceivedURL() {
        return clientOnPaymentReceivedURL;
    }

    public String getBaseAccountIBAN() {
        return baseAccountIBAN;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public int getTransactionCode() {
        return transactionCode;
    }

    public String getBookingId() {
        return bookingId;
    }
}
