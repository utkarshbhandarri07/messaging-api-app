package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MeassgingApiAppApplication {
	
	@GetMapping("hi")
	public static String printt()
	{
		return "hi oracle";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MeassgingApiAppApplication.class, args);
	System.out.println("prt greetg");
	}
	
	

}
