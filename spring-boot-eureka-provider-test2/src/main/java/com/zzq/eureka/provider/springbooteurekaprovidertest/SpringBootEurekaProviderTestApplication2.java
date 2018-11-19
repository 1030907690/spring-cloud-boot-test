package com.zzq.eureka.provider.springbooteurekaprovidertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaProviderTestApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaProviderTestApplication2.class, args);
	}
}
