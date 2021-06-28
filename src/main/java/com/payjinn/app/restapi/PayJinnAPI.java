package com.payjinn.app.restapi;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import com.payjinn.app.model.InitiatePayment;
import com.payjinn.app.model.Payment;
import com.payjinn.app.model.TransactionDetails;

public interface PayJinnAPI {

	@POST("/payments")
	Call<Payment> getSessionCode(@Body InitiatePayment initiatePayment);
	
	@GET("/payments/{sessionCode}")
	Call<TransactionDetails> getTransactionDetails(@Path("sessionCode") String sessionCode);
	
}
