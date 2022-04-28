package com.nipun.dilhan.spring_h2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/test-1") 
public class TestController1 { 

	@RequestMapping("/welcome")  
	public String welcome()   {  
		
		return "Hello welcome to git/ spring world";  
	
	} 

	@RequestMapping("/")  
	@RequestMapping("/hello")  
	public String hello()   {  
				
		return "Hello javaTpoint";  
	
	} 
	
 

}
