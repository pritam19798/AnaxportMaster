package com.Anaxport.Master.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class Test {
	
	
	@GetMapping("/hello")
	public String hello() {
		
		System.out.print("hit");
		return "Hello";
	}

}
