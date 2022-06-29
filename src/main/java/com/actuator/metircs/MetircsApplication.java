package com.actuator.metircs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MetircsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetircsApplication.class, args);
	}
	
	@Bean
	public RestTemplate getInstanceOfRestTemplate() {
		return new RestTemplate();
	}

}
