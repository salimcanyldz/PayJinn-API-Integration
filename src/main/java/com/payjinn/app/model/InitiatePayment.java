package com.payjinn.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
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
}
