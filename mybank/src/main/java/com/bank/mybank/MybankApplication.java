package com.bank.mybank;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bank.mybank.*"})
public class MybankApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(MybankApplication.class, args);
	}
	
	
}
