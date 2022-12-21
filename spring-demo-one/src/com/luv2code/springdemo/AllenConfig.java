package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
public class AllenConfig {
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	// define bean for swim coach and inject dependency
	@Bean
	public Coach allenCoach() {
		return new AllenCoach(happyFortuneService());
	}
}
