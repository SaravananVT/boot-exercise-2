package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCall {
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello Visitor.. You have successfully deployed in Cloud Foundry";
		
	}

}
