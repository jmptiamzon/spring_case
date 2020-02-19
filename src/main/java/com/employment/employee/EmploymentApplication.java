package com.employment.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class EmploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmploymentApplication.class, args);
	}

}
