package com.RegistrationForm;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = {"com.RegistrationForm.controller","com.RegistrationForm.repository"})
@ComponentScan(basePackages ="com.RegistrationForm.service")
@EntityScan("com.RegistrationForm.entity")

public class RegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
	}

}
