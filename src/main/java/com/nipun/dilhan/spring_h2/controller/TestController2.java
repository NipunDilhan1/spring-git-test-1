package com.nipun.dilhan.spring_h2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-2") 
public class TestController2 {
	
	@RequestMapping("/welcome")  
	public String welcome()   {  
		

		System.out.println(" added by nipundilhanjayarathne ");
		System.out.println("  ");

		System.out.println("added by nipun.dilhan1 ");
		System.out.println(" ");

		
		return "Hello welcome 2nd controller";   
	
	} 
	

	@RequestMapping("/n-d-j")  
	public String nipundilhanjayarathne()   {  
		
		return "Hello nipun dilhan jayarathne";  

	}
	
	@RequestMapping("/n-d")  
	public String nipundilhan()   {  
		
		return "hello nipun dilhan";  
	
	} 
	
	@RequestMapping("/second")  
	public String hello()   {  
		

		return "Hello second controller n-d ";  

	
	} 

}
