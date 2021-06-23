package com.jenkins.demo.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static Logger logger = LoggerFactory.getLogger(Application.class);
	
	public void main() {
		logger.info("application started");
	}
			
	public static void main(String[] args) {
		logger.info("application executed");
		SpringApplication.run(Application.class, args);
	}

}
