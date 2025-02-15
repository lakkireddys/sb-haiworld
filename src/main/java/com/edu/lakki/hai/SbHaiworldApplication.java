package com.edu.lakki.hai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SbHaiworldApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SbHaiworldApplication.class) ; 

	public static void main(String[] args) {
		SpringApplication.run(SbHaiworldApplication.class, args);
	}
	
	@GetMapping("/hai")
	public String hello() {
		logger.info("hai");
		return "hai.. you just started learning..!";
	}

}
