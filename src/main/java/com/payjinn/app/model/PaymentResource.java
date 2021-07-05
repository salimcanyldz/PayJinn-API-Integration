package com.payjinn.app.model;

import lombok.Data;

@Data
public class PaymentResource {

  private String paymentURL;
  private String sessionCode;
}
