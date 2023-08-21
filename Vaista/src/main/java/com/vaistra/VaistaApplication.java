package com.vaistra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vaistra.service.CountryService")
public class VaistaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaistaApplication.class, args);
	}

}
