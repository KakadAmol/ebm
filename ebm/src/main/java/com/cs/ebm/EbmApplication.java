package com.cs.ebm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EbmApplication {
	
	private static Logger log = LogManager.getLogger(EbmApplication.class); 
	
	public static void main(String[] args) {
		SpringApplication.run(EbmApplication.class, args);
		log.info("Welcome to EBM Application");
	}

}
