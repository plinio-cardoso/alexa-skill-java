package com.pliniocardoso.alexaskill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ EntityScan("pliniocardoso")
 * @ SpringBootApplication(scanBasePackages = "pliniocardoso")
 */
@SpringBootApplication
public class AlexaSkillApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlexaSkillApplication.class, args);
	}
}
