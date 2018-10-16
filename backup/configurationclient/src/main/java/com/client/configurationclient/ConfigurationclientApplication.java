package com.client.configurationclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigurationclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationclientApplication.class, args);
	}
	
	@RefreshScope
	@RestController
	class MessageRestController {

	    @Value("${message:Hello}")
	    private String message;
 
	    @RequestMapping("/message")
	    String getMessage() {
	        return this.message;
	    }
	}
}
