package com.payjinn.app.model;

import lombok.Data;

@Data
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
}
