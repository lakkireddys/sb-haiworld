package com.edu.lakki.hai.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbHaiWorldController {
	
	private static final Logger logger  = LoggerFactory.getLogger(SbHaiWorldController.class);
	
	@GetMapping("/hai")
	public String hello() {
		logger.info("inside controller");
		return "hai.. you just started learning..!";
	}

}
