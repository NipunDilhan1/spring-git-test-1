package com.nipun.dilhan.spring_h2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-2") 
public class TestController2 {
	
	@RequestMapping("/welcome")  
	public String welcome()   {  
		
		return "Hello welcome 2nd controller";   
	
	} 
	
	@RequestMapping("/second")  
	public String hello()   {  
		
		return "Hello second controller";  
	
	} 

}
