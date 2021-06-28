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
	private TransactionCode transactionCode;
	private String bookingId;
	
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
	public TransactionCode getTransactionCode() {
		return transactionCode;
	}
	public String getBookingId() {
		return bookingId;
	}
}
