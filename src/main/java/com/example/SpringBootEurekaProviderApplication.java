package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaProviderApplication.class, args);
		System.out.println("student-service-provider");
	}

}
