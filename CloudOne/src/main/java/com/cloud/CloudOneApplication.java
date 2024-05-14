package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CloudOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudOneApplication.class, args);
	}
	@GetMapping("/")
	public String getName() {
		return "Hello Spring boot!!";
	}
}
