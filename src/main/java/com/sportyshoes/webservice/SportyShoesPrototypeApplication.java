package com.sportyshoes.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SportyShoesPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesPrototypeApplication.class, args);
		System.out.println("Hey there! Welcome to the prototype of Sporty Shoes App!");
		System.out.println("Happy virtual Shopping Experience!!! ");
		System.out.println("Developer - Hemachandiran T");
		System.out.println("Open - http://localhost:8089/swagger-ui.html");
	}

}
