package com.payjinn.app.restapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.payjinn.app.model.InitiatePayment;
import com.payjinn.app.model.PaymentResource;
import com.payjinn.app.model.TransactionCode;
import com.payjinn.app.model.TransferAmount;
import org.slf4j.*;

public class PayjinnClient {
	
	Logger log = LoggerFactory.getLogger(PayjinnClient.class);
	
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
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }

    public PaymentResource post(){
        InitiatePayment ip = new InitiatePayment("10",
                new TransferAmount("100","100"),
                "",
                "",
                "",
                "",
                "en",
                "100",
                new TransactionCode(new Object(), 0),
                "10");
        String res = new Gson().toJson(ip).replace("TransferAmountObject", "transferAmount").replace("TransactionCodeObject", "transactionCode");
        log.info(res);
        HttpEntity<String> reqEntity = new HttpEntity<>(res, headers);
        try{
            ResponseEntity<PaymentResource> resEntity = restTemplate.exchange(server + "/payments",
                    HttpMethod.POST,
                    reqEntity,
                    PaymentResource.class);
            this.setStatus(resEntity.getStatusCode());
            return resEntity.getBody();
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public String getServer() {
        return server;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public HttpHeaders getHeaders() {
		return headers;
	}
}
