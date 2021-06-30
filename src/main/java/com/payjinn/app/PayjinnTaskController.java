package com.payjinn.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.payjinn.app.model.PaymentResource;
import com.payjinn.app.restapi.PayjinnClient;
import org.slf4j.*;

@RestController
public class PayjinnTaskController {

	Logger log = LoggerFactory.getLogger(PayjinnTaskController.class);
	
	@Value("${auth.username}")
	private String username;
	
	@Value("${auth.password}")
	private String password;
	
    @GetMapping("/")
    public String test(){
        return "Testing";
    }

    @PostMapping("/")
    public String startOperation(){
    	try {
    		PayjinnClient rest = new PayjinnClient(username, password);
            PaymentResource pr = rest.post();
            if (rest.getStatus() != HttpStatus.OK){
                return HttpStatus.INTERNAL_SERVER_ERROR.toString();
            }
            return new Gson().toJson(pr);
    	}
    	catch (Exception e) {
    		return "Testing Error";
    	}
        
    }
}
