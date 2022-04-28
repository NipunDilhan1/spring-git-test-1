package com.nipun.dilhan.spring_h2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
	
	@RequestMapping("/welcome")  
	public String welcome()   {  
		
		return "Hello welcome 2nd controller";   
	
	} 
	
	@RequestMapping("/hello")  
	public String hello()   {  
		
		return "Hello second controller";  
	
	} 

}
