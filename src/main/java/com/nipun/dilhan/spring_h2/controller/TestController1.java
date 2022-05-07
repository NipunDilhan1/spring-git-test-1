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

	@RequestMapping("/hello")  
	public String hello()   {  
				
		return "Hello hello";  
	
	} 
	
	@RequestMapping("/method-3")  
	public String method3()   {  
				
		return "Hello method 3";  
	
	} 
	
	@RequestMapping("/method-4")  
	public String fourthMethod()   {  
				
		return "Hello javaTpoint ndj";  
	
	} 
	

	@RequestMapping("/method-5")  
	public String Method5()   {  
				
		return "Hello javaTpoint m5 ndj";  
	}
	
	@RequestMapping("/m-6")  
	public String m6()   {  
				
		return "Hello javaTpoint m6 nd1";  

	
	} 
	
 

}
