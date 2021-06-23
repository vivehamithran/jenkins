package com.jenkins.demo.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Test
	void contextLoads() {
		logger.info("application test executed");
		assertEquals(true, true);
	}

}
