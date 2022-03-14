package com.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.school.config","com.school.controller","com.school.model","com.school.repositories","com.school.service"})
public class AuthOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthOauthApplication.class, args);
	}

}
