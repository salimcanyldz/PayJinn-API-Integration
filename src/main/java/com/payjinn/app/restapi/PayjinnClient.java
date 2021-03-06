package com.payjinn.app.restapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payjinn.app.model.InitiatePayment;
import com.payjinn.app.model.PaymentResource;
import com.payjinn.app.model.TransactionDetail;
import com.payjinn.app.model.TransferAmount;
import lombok.Data;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Data
public class PayjinnClient {

  private String username;
  private String password;
  private String server = "https://api.payjinn.com/gateway";
  private final RestTemplate restTemplate;
  private final HttpHeaders headers;
  private HttpStatus status;

  public PayjinnClient(String username, String password) {
    this.username = username;
    this.password = password;
    this.restTemplate = new RestTemplate();
    this.headers = new HttpHeaders();
    headers.add("Content-Type", "application/json");
    try {
      headers.setBasicAuth(username, password);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public PaymentResource post() throws JsonProcessingException {

    InitiatePayment ip =
        new InitiatePayment(
            "10", new TransferAmount("100", "EUR"), "", "", "", "", "", "PAYJINN", 0, "10");

    String jsonFormat = new ObjectMapper().writeValueAsString(ip);
    HttpEntity<String> reqEntity = new HttpEntity<>(jsonFormat, headers);

    try {
      ResponseEntity<PaymentResource> resEntity =
          restTemplate.exchange(
              server + "/payments", HttpMethod.POST, reqEntity, PaymentResource.class);
      this.setStatus(resEntity.getStatusCode());
      return resEntity.getBody();
    } catch (Exception e) {
      e.printStackTrace();
      this.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
      return null;
    }
  }

  public TransactionDetail get(PaymentResource paymentResource) throws JsonProcessingException {

    HttpEntity<String> reqEntity =
        new HttpEntity<>(new ObjectMapper().writeValueAsString(paymentResource), headers);
    try {

      ResponseEntity<TransactionDetail> resEntity =
          restTemplate.exchange(
              server + "/payments/{sessionCode}",
              HttpMethod.GET,
              reqEntity,
              TransactionDetail.class,
              paymentResource.getSessionCode());
      this.setStatus(resEntity.getStatusCode());

      return resEntity.getBody();
    } catch (Exception e) {
      e.printStackTrace();
      this.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
      return null;
    }
  }
}
