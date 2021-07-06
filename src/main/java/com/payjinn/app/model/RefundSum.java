package com.payjinn.app.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
public class RefundSum {

  private String value;
  private String currency;
}
