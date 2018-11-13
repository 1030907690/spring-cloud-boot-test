package com.zzq.eureka.service.springbooteurekaservicetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaServiceTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServiceTestApplication.class, args);
	}
}
