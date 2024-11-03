package com.javahub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.experimental.PackagePrivate;

@SpringBootApplication
@RestController
public class CicddemoApplication {

	@GetMapping("welcome/{name}")
	public String hello(@PathVariable String name) {
		
		return "Hello "+name+"successfulyy deployed!!";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(CicddemoApplication.class, args);
	}

}
