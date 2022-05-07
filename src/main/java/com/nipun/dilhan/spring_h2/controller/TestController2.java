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
	


	
	@RequestMapping("/n-d")  
	public String nipundilhan()   {  
		
		return "hello nipun dilhan";  
	
	} 
	

	@RequestMapping("/method-3")  
	public String method3()   {  
				 
		return "Hello method 3 ndj";  
	}

	
	@RequestMapping("/n-d-m6")  
	public String method6()   {  
		
		return "hello m-6 ndj ";  
	
	} 



}
