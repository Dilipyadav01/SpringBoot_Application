package com.TestAPI.RestAPI.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class Testdemo {

	
	
	@RequestMapping("/test")  
	public String hello()   
	{  
	return "Hello javaTpoint";  
	}
	
}
