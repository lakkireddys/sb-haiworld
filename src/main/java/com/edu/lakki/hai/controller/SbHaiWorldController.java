package com.edu.lakki.hai.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.lakki.hai.config.ApplicationConfig;

@RestController
public class SbHaiWorldController {
	
	private static final Logger logger  = LoggerFactory.getLogger(SbHaiWorldController.class);
	
	private final ApplicationConfig config;
	
	
	public SbHaiWorldController(ApplicationConfig config) {
		super();
		this.config = config;
	}


	@GetMapping("/hai")
	public String hello() {
		logger.info("inside controller");
		return "hai.. you just started learning..!";
	}

}
