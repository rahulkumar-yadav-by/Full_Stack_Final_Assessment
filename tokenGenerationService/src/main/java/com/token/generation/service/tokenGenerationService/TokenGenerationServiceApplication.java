package com.token.generation.service.tokenGenerationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient //enabling eureka client to be discovered
@EnableFeignClients //feign for intelligent routing of clients/services
@SpringBootApplication
public class TokenGenerationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokenGenerationServiceApplication.class, args);
	}

}
