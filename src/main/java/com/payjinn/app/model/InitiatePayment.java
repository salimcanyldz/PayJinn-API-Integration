package com.payjinn.app.model;

public class InitiatePayment {

	private String clientOrderCode;
    TransferAmount TransferAmountObject;
    private String clientNotificationURL;
    private String clientSuccessURL;
    private String clientOnPaymentReceivedURL;
    private String baseAccountIBAN;
    private String languageCode;
    private String paymentCode;
    TransactionCode TransactionCodeObject;
    private String bookingId;

    public InitiatePayment(String clientOrderCode,
                           TransferAmount transferAmountObject,
                           String clientNotificationURL,
                           String clientSuccessURL,
                           String clientOnPaymentReceivedURL,
                           String baseAccountIBAN,
                           String languageCode,
                           String paymentCode,
                           TransactionCode transactionCodeObject,
                           String bookingId) {

        this.clientOrderCode = clientOrderCode;
        TransferAmountObject = transferAmountObject;
        this.clientNotificationURL = clientNotificationURL;
        this.clientSuccessURL = clientSuccessURL;
        this.clientOnPaymentReceivedURL = clientOnPaymentReceivedURL;
        this.baseAccountIBAN = baseAccountIBAN;
        this.languageCode = languageCode;
        this.paymentCode = paymentCode;
        TransactionCodeObject = transactionCodeObject;
        this.bookingId = bookingId;
    }

    public String getClientOrderCode() {
        return clientOrderCode;
    }

    public TransferAmount getTransferAmountObject() {
        return TransferAmountObject;
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

    public TransactionCode getTransactionCodeObject() {
        return TransactionCodeObject;
    }

    public String getBookingId() {
        return bookingId;
    }
}
