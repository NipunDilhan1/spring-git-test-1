package com.nipun.dilhan.spring_h2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class TestController1 { 


	@RequestMapping("/")  
	public String hello()   {  
				
		return "Hello javaTpoint";  
	
	} 
	
 

}
