package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWithJenkinsApplication {
	
	
	@RequestMapping("/")
	public String home() {
	    return "Hello This is Anon";
	  }
	public static void main(String[] args) {
		SpringApplication.run(SpringWithJenkinsApplication.class, args);
	}

}
