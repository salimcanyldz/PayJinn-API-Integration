package com.payjinn.app.model;

public class TransactionDetail {

	private String sessionCode;
	private String clientId;
	private String sessionType;
	private String beginDate;
	private String beginTime;
	private String endDate;
	private String endTime;
	private String clientOrderCode;
	private TransferAmount transferAmount;
	private String baseAccountHolderName;
	private String baseCountryCode;
	private String baseBLZ;
	private String baseBIC;
	private String baseIBAN;
	private String senderAccountHolderName;
	private String senderCountryCode;
	private String senderBLZ;
	private String senderBIC;
	private String senderIBAN;
	private String providerCode;
	private String providerTransactionId;
	private String paymentCode;
	private boolean transactionState;
	private String tranResult;
	private String tranResultInfo;
	private String postAuthDate;
	private String postAuthTime;
	private String voidDate;
	private String voidTime;
	private int refundCount;
	private String lastRefundDate;
	private String lastRefundTime;
	private RefundSum refundSum;
	private String orgSessionCode;
	private boolean paymentReceived;
	private String paymentReceiveDate;
	private String paymentReceiveTime;
	private String bookingId;
	
	public String getSessionCode() {
		return sessionCode;
	}
	public String getClientId() {
		return clientId;
	}
	public String getSessionType() {
		return sessionType;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public String getEndDate() {
		return endDate;
	}
	public String getEndTime() {
		return endTime;
	}
	public String getClientOrderCode() {
		return clientOrderCode;
	}
	public TransferAmount getTransferAmount() {
		return transferAmount;
	}
	public String getBaseAccountHolderName() {
		return baseAccountHolderName;
	}
	public String getBaseCountryCode() {
		return baseCountryCode;
	}
	public String getBaseBLZ() {
		return baseBLZ;
	}
	public String getBaseBIC() {
		return baseBIC;
	}
	public String getBaseIBAN() {
		return baseIBAN;
	}
	public String getSenderAccountHolderName() {
		return senderAccountHolderName;
	}
	public String getSenderCountryCode() {
		return senderCountryCode;
	}
	public String getSenderBLZ() {
		return senderBLZ;
	}
	public String getSenderBIC() {
		return senderBIC;
	}
	public String getSenderIBAN() {
		return senderIBAN;
	}
	public String getProviderCode() {
		return providerCode;
	}
	public String getProviderTransactionId() {
		return providerTransactionId;
	}
	public String getPaymentCode() {
		return paymentCode;
	}
	public boolean isTransactionState() {
		return transactionState;
	}
	public String getTranResult() {
		return tranResult;
	}
	public String getTranResultInfo() {
		return tranResultInfo;
	}
	public String getPostAuthDate() {
		return postAuthDate;
	}
	public String getPostAuthTime() {
		return postAuthTime;
	}
	public String getVoidDate() {
		return voidDate;
	}
	public String getVoidTime() {
		return voidTime;
	}
	public int getRefundCount() {
		return refundCount;
	}
	public String getLastRefundDate() {
		return lastRefundDate;
	}
	public String getLastRefundTime() {
		return lastRefundTime;
	}
	public RefundSum getRefundSum() {
		return refundSum;
	}
	public String getOrgSessionCode() {
		return orgSessionCode;
	}
	public boolean isPaymentReceived() {
		return paymentReceived;
	}
	public String getPaymentReceiveDate() {
		return paymentReceiveDate;
	}
	public String getPaymentReceiveTime() {
		return paymentReceiveTime;
	}
	public String getBookingId() {
		return bookingId;
	}
}
