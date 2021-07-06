package com.payjinn.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.payjinn.app.db.TransactionEntity;
import com.payjinn.app.db.TransactionRepository;
import com.payjinn.app.model.PaymentResource;
import com.payjinn.app.model.TransactionDetail;
import com.payjinn.app.restapi.PayjinnClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayjinnTaskController {

  @Value("${auth.username}")
  private String username;

  @Value("${auth.password}")
  private String password;
  
  @Autowired
  private TransactionRepository transactionRepository;

  @CrossOrigin
  @GetMapping("/")
  public ResponseEntity<String> startOperation() {
    try {
      PayjinnClient rest = new PayjinnClient(username, password);
      PaymentResource pr = rest.post();
      if (rest.getStatus() != HttpStatus.OK) {
        return new ResponseEntity<>("Client Connection Failed..", HttpStatus.INTERNAL_SERVER_ERROR);
      } else {
        TransactionDetail td = rest.get(pr);
        if (rest.getStatus() != HttpStatus.OK) {
          return new ResponseEntity<>(
              "Client Connection Failed..", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        String transactionJSON= new ObjectMapper().writeValueAsString(td);
        transactionRepository.save(new TransactionEntity(transactionJSON));
        transactionRepository.flush();
        return new ResponseEntity<>(transactionJSON, HttpStatus.OK);
      }
    } catch (Exception e) {
      return new ResponseEntity<>("Server Failed..", HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
